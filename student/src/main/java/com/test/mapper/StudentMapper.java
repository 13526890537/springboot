package com.test.mapper;

import domin.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Results(id = "studentMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "like", property = "like")})
    @Select("SELECT * FROM student")
    List<Student> getAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    @ResultMap("studentMap")
    Student getOne(Long id);

}
