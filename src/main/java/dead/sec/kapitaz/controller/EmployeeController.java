package dead.sec.kapitaz.controller;

import dead.sec.kapitaz.dao.EmployeeDao;
import dead.sec.kapitaz.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> employeeList = employeeDao.getAllEmployees();
        model.addAttribute("allEmps", employeeList);

        return "all-employees";
    }
}
