package com.demo.student.serviceImpl;

import com.demo.student.entity.Student;
import com.demo.student.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author OUKELE
 * @create 2019-04-14 17:11
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImpl {

    @Autowired
    private StudentService studentService;

    @Test
    public void getList(){
        System.out.println(studentService.listAll());
    }

    @Test
    public void update(){
        Student student = new Student();
        student.setStuId(2);
        student.setStuNumber("ABB12");
        student.setStuName("三代啦啦");
        student.setStuAge(19);
        student.setStuSex("男");
        boolean flag = false;

        try {
            studentService.update(student);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        System.out.println(flag);
    }

}
