package com.nis.Client.repository;

import com.nis.Client.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Long> {
    public  Student addStudent(Student student);
    public  Student updateStudent(Student student);
    public  Student searchStudent(long id);
    public  Student searchStudentByHallTicket(long ticketNo);
    public Boolean deleteStudent(long id);

}
