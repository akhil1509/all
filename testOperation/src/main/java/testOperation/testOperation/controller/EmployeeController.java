package testOperation.testOperation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testOperation.testOperation.model.Employee;
import testOperation.testOperation.repository.EmployeeRepository;
import testOperation.testOperation.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/msg")
public class EmployeeController {

  @Autowired
    private EmployeeService employeeService;
  @PostMapping("/emp")

  public Employee createEmployee(@RequestBody Employee employee)
  {
    return employeeService.createEmployee(employee);
  }

  @GetMapping("/employee/{id}")
  public  Employee getEmployeeById(@PathVariable Long id){
    return employeeService.getEmployeeById(id);
  }
  @GetMapping("/employee")
  public List<Employee> getAllEmployee(){
    return  employeeService.getAllEmployee();
  }

  @DeleteMapping("/pooja/{id}")
  public  String employeeDelete(@PathVariable("id") Long id){
   return employeeService.employeeDelete(id);

  }

  @PutMapping("/sahani/{id}")
  public String updateById(@PathVariable Long id, @RequestBody Employee employee)
  {
    return employeeService.updateById(id, employee);
    
  }
}
