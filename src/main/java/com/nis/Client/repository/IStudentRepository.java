package com.nis.Client.repository;

import com.nis.Client.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.util.Assert;

import java.util.Optional;

public interface IStudentRepository extends JpaRepository<Student,Long> {
    default Student addStudent(Student student) {
        Assert.isNull(student.getId(), "Student ID for new college should be null");
        return save(student);
    }
    default Student updateStudent(Student student) {
        Assert.notNull(student.getId(), "student ID for update college should not be null");
        return save(student);
    }
    default Optional<Student> searchStudent(long id){
        return findById(id);
    }
    default Optional<Student> searchStudentByHallTicket(long ticketNo){
        return findById(ticketNo);
    }
    default void deleteStudent(long id){
        deleteById(id);
    }

}
