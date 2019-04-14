package com.demo.student.dao;

import com.demo.student.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface StudentDao extends CrudRepository<Student,Integer> {

    @Modifying
    @Transactional
    @Query("update Student set stu_name = :stuName where stu_id = :stuId")
    void updateByStuId(@Param("stuId") int stuId ,@Param("stuName") String stuName);

}
