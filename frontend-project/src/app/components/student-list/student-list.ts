import { Component } from '@angular/core';
import { Student } from '../../models/student.model';
import { StudentService } from '../../services/student.service';

@Component({
  selector: 'app-student-list',
  imports: [],
  templateUrl: './student-list.html',
  styleUrl: './student-list.css',
})
export class StudentList {

  students: Student[] = [];
  loading = false;
  error?: string;

  constructor(
    private studentService: StudentService,
  ) { }

  ngOnInit(): void {
    this.loadStudents();
  }

  loadStudents(): void {
    this.loading = true;
    this.studentService.getAll().subscribe({
      next: (students) => {
        this.students = students;
        this.loading = false;
      },
      error: () => {
        this.error = 'Erreur lors du chargement des étudiants';
        this.loading = false;
      }
    });
  }

  deleteStudent(id: number) {
    if (confirm("Are you sure to remove this post?")) {
      this.studentService.delete(id).subscribe(() => {
        this.loadStudents();
      });
    }
  }
}
