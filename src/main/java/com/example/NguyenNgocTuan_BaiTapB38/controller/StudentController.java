package com.example.NguyenNgocTuan_BaiTapB38.controller;

import com.example.NguyenNgocTuan_BaiTapB38.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private final List<Student> studentList = new ArrayList<>();

    // Thêm student bằng @RequestParam
    @PostMapping("/addByRequestParam")
    public List<Student> addByRequestParam(@RequestParam String name, @RequestParam int age) {
        studentList.add(new Student(name, age));
        return studentList;
    }

    // Thêm student bằng @PathVariable
    @PostMapping("/addByPathVariable/{name}/{age}")
    public List<Student> addByPathVariable(@PathVariable String name, @PathVariable int age) {
        studentList.add(new Student(name, age));
        return studentList;
    }

    // Thêm student bằng @RequestBody
    @PostMapping("/addByRequestBody")
    public List<Student> addByRequestBody(@RequestBody Student student) {
        studentList.add(student);
        return studentList;
    }
}
