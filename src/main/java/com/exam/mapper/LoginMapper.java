package com.exam.mapper;


import com.exam.entity.Admin;
import com.exam.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("select adminId,adminName,sex,tel,email,cardId,role from admin where adminId = #{username} and pwd = #{password}")
    public Admin adminLogin(Integer username, String password);


    @Select("select studentId,studentName,grade,major,clazz,institute,tel," +
            "email,cardId,sex,role from student where studentId = #{username} and pwd = #{password}")
    public Student studentLogin(Integer username, String password);
}
