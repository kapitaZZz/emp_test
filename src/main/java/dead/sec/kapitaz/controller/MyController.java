package dead.sec.kapitaz.controller;

import dead.sec.kapitaz.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    private EmployeeDao employeeDao;


    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        model.addAttribute("allEmployee", employeeDao.getAllEmployees());

        return "all-employees";
    }
}
