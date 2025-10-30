package fit.iuh.se.thymeleaf.controller;


import fit.iuh.se.thymeleaf.model.Employee;
import fit.iuh.se.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Hiển thị trang chủ (danh sách) và xử lý tìm kiếm
    @GetMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees(keyword));
        model.addAttribute("keyword", keyword);
        return "employee_list";
    }

    // Hiển thị form thêm mới
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("pageTitle", "REGISTRATION EMPLOYEE"); // Tiêu đề trang
        return "employee_form";
    }

    // Xử lý lưu (cả thêm mới và cập nhật)
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    // Hiển thị form cập nhật
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        model.addAttribute("pageTitle", "UPDATE EMPLOYEE"); // Tiêu đề trang
        return "employee_form";
    }

    // Xử lý xóa
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") Long id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}