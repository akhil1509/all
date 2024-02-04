package testOperation.testOperation.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import testOperation.testOperation.model.Employee;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    List<Employee> getAllEmployee();


   String employeeDelete(Long id);

  public String updateById(Long id, Employee employee);




}
