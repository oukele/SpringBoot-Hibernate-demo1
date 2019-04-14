package com.demo.student.service.Impl;

import com.demo.student.dao.StudentDao;
import com.demo.student.entity.Student;
import com.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OUKELE
 * @create 2019-04-13 18:24
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> listAll() {
        return (List<Student>) studentDao.findAll();
    }

    @Override
    public int save(Student student) {
        return studentDao.save(student)!= null ? 1:0;
    }

    @Override
    public int delete(int stuId) {
        int i = 0;
        try {
            studentDao.deleteById(stuId);
            i = 1;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return i;
    }

    @Override
    public int update(Student student) {
        return studentDao.save(student) !=null ? 1:0;
    }
}
