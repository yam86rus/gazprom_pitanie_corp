package com.portal.controller;

import com.portal.entity.Employee;
import com.portal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping ("/")
    public String getInfoForAllEmps(){
        return "view_for_all_employees";
    }

    @RequestMapping("/hr_info")
    public String getInfoOnlyForHR(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "view_for_hr";
    }

    @RequestMapping("/manager_info")
    public String getInfoOnlyForManagers(Model model){
        return "view_for_managers";
    }

}
