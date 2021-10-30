package dead.sec.kapitaz.dao;

import dead.sec.kapitaz.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void removeEmployeeById(int id);

    public Employee getEmployeeById(int id);

    public Employee editEmployeeById(int id);

}
