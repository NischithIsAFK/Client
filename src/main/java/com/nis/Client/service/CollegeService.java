package com.nis.Client.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nis.Client.entity.College;
import com.nis.Client.repository.CollegeRepository;
@Service
public class CollegeService {
@Autowired
CollegeRepository collegeRepository;
public College save(College emp) {
return collegeRepository.save(emp);
}
public College getCollege(long id) {
return collegeRepository.findById(id).get();
}
public College update(long id,College employee) {
	College emps=collegeRepository.findById(id).get();
	emps.setCollegeAdmin(employee.getCollegeAdmin());
	emps.setCollegeName(employee.getCollegeName());
	emps.setLocation(employee.getLocation());
return collegeRepository.save(emps); 
}
public String delete(long id)
{
	collegeRepository.deleteById(id);
return "Entity deleted" +id;
}
public List<College> getEmplist()
{
return collegeRepository.findAll();
}
public CollegeRepository getCollegeRepository() {
return collegeRepository;
}
public void setCollegeRepository(CollegeRepository employeeRepository) {
this.collegeRepository = employeeRepository;
}
}
