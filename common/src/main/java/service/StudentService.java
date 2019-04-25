package service;

import domin.Student;

import java.util.List;

/**
 * 学生接口
 *
 * @author wzs
 * @create 2019-04-25 11:10
 **/
public interface StudentService {
    Student findStudent();
    List<Student> findAllStudent();
}
