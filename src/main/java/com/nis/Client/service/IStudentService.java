package com.nis.Client.service;

import com.nis.Client.entity.Certificate;
import com.nis.Client.entity.Student;

public interface IStudentService {
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public  Student searchStudentById(Long id);
    public  Student searchStudentByHallTicket(Long ticketNo);
    public Boolean addCertificate(Certificate certificate);
    public Boolean updateCertificate(Certificate certificate);
    public Boolean deleteStudent(Long id);

}
