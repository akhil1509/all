package testOperation.testOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testOperation.testOperation.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
