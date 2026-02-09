package com.service.school.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.server.common.lib.dto.StudentDto;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.student-url}")
public interface StudentClient {

    @GetMapping("/school/{schoolId}")
    List<StudentDto> findAllStudentsBySchool(@PathVariable("schoolId") Integer schoolId);
}
