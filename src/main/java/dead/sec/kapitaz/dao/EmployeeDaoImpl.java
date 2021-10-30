package dead.sec.kapitaz.dao;

import dead.sec.kapitaz.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> employeeList = session.createQuery("from Employees", Employee.class).getResultList();

        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void removeEmployeeById(int id) {

    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public Employee editEmployeeById(int id) {
        return null;
    }
}
