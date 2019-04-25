package com.test.imp;

import com.alibaba.dubbo.config.annotation.Service;
import domin.Student;
import org.springframework.beans.factory.annotation.Autowired;
import service.StudentService;
import com.test.mapper.StudentMapper;

import java.util.List;


@Service(version = "1.0.0")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findStudent() {
        return  studentMapper.getOne(1L);
    }

    @Override
    public List<Student> findAllStudent() {
        return  studentMapper.getAll();
    }
}