package fit.iuh.se.thymeleaf.service;

import fit.iuh.se.thymeleaf.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees(String keyword);
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}