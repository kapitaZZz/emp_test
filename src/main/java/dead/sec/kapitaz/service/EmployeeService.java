package dead.sec.kapitaz.service;

import dead.sec.kapitaz.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
