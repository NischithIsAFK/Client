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
        Assert.notNull(student.getId(), "Student ID for update college should not be null");
        return save(student);
    }
    default Optional<Student> searchStudent(Long id) {
        Assert.notNull(id, "Student ID for new college should not be null");
        return findById(id);
    }
    default Optional<Student> searchStudentByHallTicket(Long ticketNo) {
        Assert.notNull(ticketNo, "Student Hall ticket for new college should not be null");
        return findByHallTicketNo(ticketNo);
    }
    default void deleteStudent(Long id) {
        Assert.notNull(id, "Student ID for new college should be not null");
        deleteById(id);
    }
    
    public Optional<Student> findByHallTicketNo(Long id);

}
