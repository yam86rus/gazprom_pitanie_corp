package com.portal.controller;

import com.portal.dao.UsersDAO;
import com.portal.entity.Employee;
import com.portal.entity.Users;
import com.portal.service.EmployeeService;
import com.portal.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UsersService usersService;

    @RequestMapping ("/")
    public String getInfoForAllEmps(){
        return "main";
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

    @RequestMapping ("/employees")
    public String showEmployeesPage(){
        return "employees";
    }

    @RequestMapping ("/news")
    public String showNewsPage(){
        return "news";
    }

    @RequestMapping ("/documents")
    public String showDocumentsPage(){
        return "documents";
    }

    @RequestMapping ("/knowledge")
    public String showKnowledgePage(){
        return "knowledge";
    }

    @RequestMapping ("/vacancies")
    public String showVacanciesPage(){
        return "vacancies";
    }

    @RequestMapping ("/gallery")
    public String showGalleryPage(){
        return "gallery";
    }

    @RequestMapping ("/tradeUnion")
    public String showTradeUnionPage(){
        return "tradeUnion";
    }

    @RequestMapping ("/about")
    public String showAboutPage(){
        return "about";
    }

    @RequestMapping ("/administrator")
    public String showAdminPage(){
        return "administrator";
    }

    @RequestMapping ("/users")
    public String showUsersPage(Model model){
        List<Users> allUsers = usersService.getAllUsers();
        model.addAttribute("allUsers",allUsers);
        return "users";
    }


}
