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
public College getCollege(int id) {
return collegeRepository.findById(id).get();
}
public College update(int id,College employee) {
	College emps=collegeRepository.findById(id).get();
	emps.setClg_admin(employee.getClg_admin());
	emps.setClg_name(employee.getClg_name());
	emps.setLoc(employee.getLoc());
return collegeRepository.save(emps); 
}
public String delete(int id)
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
