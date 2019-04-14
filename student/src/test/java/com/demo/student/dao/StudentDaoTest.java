package com.demo.student.dao;

import com.demo.student.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试接口
 *
 * @author OUKELE
 * @create 2019-04-13 16:43
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    // 测试 查询 student 表中所有的数据
    @Test
    public void getList(){
        List<Student> list = (List<Student>) studentDao.findAll();
        System.out.println(list);
    }

    // 测试 修改 student 表中某条数据
    @Test
    public void update(){

        boolean flag = false;
        try {
            studentDao.updateByStuId(2,"二代啦啦");
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        System.out.println(flag);
    }

    // 测试 向 student 表 新增一条记录
    //.........

}
