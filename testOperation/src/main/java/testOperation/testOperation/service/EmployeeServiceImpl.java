package testOperation.testOperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import testOperation.testOperation.model.Employee;
import testOperation.testOperation.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
       return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
      return employeeRepository.findAll();
    }

    @Override
    public String employeeDelete(Long id) {
      if ((employeeRepository.findById(id).isPresent())){
          employeeRepository.deleteById(id);
          return "successfull";
      }
      return "not employee";
    }

    @Override
    public String updateById( Long id,  Employee employee) {
        Employee employee1 = employeeRepository.findById(id).orElse(null);
        if(employee1==null){
            return "not found";
        }
        employee1.setId(employee.getId());
        employee1.setName(employee.getName());
        employee1.setAddress(employee.getAddress());
        employee1.setEmail(employee.getEmail());
        Employee save = employeeRepository.save(employee1);
        return  "found";    }


}
