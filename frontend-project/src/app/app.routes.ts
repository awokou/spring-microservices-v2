import { Routes } from '@angular/router';
import { StudentList } from './components/student-list/student-list';
import { StudentShow } from './components/student-list/student-show/student-show';
import { StudentEdit } from './components/student-list/student-edit/student-edit';
import { StudentCreate } from './components/student-list/student-create/student-create';

export const routes: Routes = [
    {
        path: '',
        pathMatch: 'full',
        component: StudentList
    },
    {
        path: "students/create",
        component: StudentCreate
    },
    {
        path: "students/:studentId/edit",
        component: StudentEdit
    },
    {
        path: "students/:schoolId",
        component: StudentShow
    },
];
