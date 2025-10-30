package fit.iuh.se.thymeleaf.service.impl;

import fit.iuh.se.thymeleaf.model.Employee;
import fit.iuh.se.thymeleaf.repository.EmployeeRepository;
import fit.iuh.se.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(String keyword) {
        if (keyword != null && !keyword.isEmpty()) {
            return employeeRepository.searchByKeyword(keyword);
        }
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Không tìm thấy nhân viên với ID: " + id);
        }
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}