package com.nis.Client.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nis.Client.entity.College;
import com.nis.Client.service.CollegeService;
@RestController
@RequestMapping("/employees")
public class CollegeController {
@Autowired
CollegeService collegeService;
public CollegeService getCollegeService() {
return collegeService;
}
public void setCollegeService(CollegeService employeeService) {
this.collegeService = employeeService;
}
// http://localhost:8071/employees/create - Post
@PostMapping("/create")
public College addEmployee(@RequestBody College employee)
{
return collegeService.save(employee);
}
// http://localhost:8071/employees/2 -GET
@GetMapping(value = "/{id}")
public College getCollege(@PathVariable int id)
{
return collegeService.getCollege(id); 
}
//http://localhost:8071/employees/id -PUT
@PutMapping(path="/{id}") 
public College updateCollege(@RequestBody College employee,@PathVariable int id)
{
return collegeService.update(id,employee); 
}
//http://localhost:8071/employees/2 -DELETE
@DeleteMapping(path="/{id}")
public String deleteCollege(@PathVariable int id)
{
return collegeService.delete(id); 
}
//http://localhost:8071/employees GET
@GetMapping
public List<College> getAllCollege()
{
return collegeService.getEmplist();
}
}
