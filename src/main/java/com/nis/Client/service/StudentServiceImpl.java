package com.nis.Client.service;

import com.nis.Client.entity.Certificate;
import com.nis.Client.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student searchStudentById(long id) {
        return null;
    }

    @Override
    public Student searchStudentByHallTicket(long ticketNo) {
        return null;
    }

    @Override
    public Boolean addCertificate(Certificate certificate) {
        return null;
    }

    @Override
    public Boolean updateCertificate(Certificate certificate) {
        return null;
    }

    @Override
    public Boolean deleteStudent(long id) {
        return null;
    }
}
