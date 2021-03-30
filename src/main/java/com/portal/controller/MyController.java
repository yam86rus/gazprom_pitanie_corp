package com.portal.controller;

import com.portal.entity.Employee;
import com.portal.entity.Users;
import com.portal.entity.Vacancy;
import com.portal.service.EmployeeService;
import com.portal.service.UsersService;
import com.portal.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UsersService usersService;

    @Autowired
    private VacancyService vacancyService;

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

    // -------------------------- Employee----------------------------//
    @RequestMapping ("/employees")
    public String showEmployeesPage(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "employees";
    }
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";

    }
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

    // ********************* Employee ****************************** //

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


// -------------------------- Vacancy ----------------------------//

    @RequestMapping ("/vacancies")
    public String showVacanciesPage(Model model){
        List<Vacancy> allVacancies = vacancyService.getAllVacancies();
        model.addAttribute("allVacancies", allVacancies);
        return "vacancies";
    }

    @RequestMapping("/addNewVacancy")
    public String addNewVacancy(Model model) {
        Vacancy vacancy = new Vacancy();
        model.addAttribute("vacancy", vacancy);
        return "vacancy-info";

    }
    @RequestMapping("/saveVacancy")
    public String saveVacancy(@ModelAttribute("vacancy") Vacancy vacancy) {
        vacancyService.saveVacancy(vacancy);
        return "redirect:/vacancies";
    }

    @RequestMapping("/updateVacancy")
    public String updateVacancy(@RequestParam("vacancyId") int id, Model model){
        Vacancy vacancy = vacancyService.getVacancy(id);
        model.addAttribute("vacancy", vacancy);
        return "vacancy-info";
    }

    @RequestMapping("/deleteVacancy")
    public String deleteVacancy(@RequestParam("vacancyId") int id){
        vacancyService.deleteVacancy(id);
        return "redirect:/vacancies";
    }

    // /-------------------------- Vacancy ----------------------------//

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
