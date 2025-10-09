package tuan7.service;


import org.springframework.stereotype.Service;
import tuan7.entity.Employee;
import tuan7.repository.EmployeeRepositoryJdbc;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepositoryJdbc repository;

    public EmployeeService(EmployeeRepositoryJdbc repository) {
        this.repository = repository;
    }

    public void demo() {
        System.out.println("=== Dữ liệu ban đầu ===");
        repository.findAll().forEach(System.out::println);

        System.out.println("\n=== Thêm nhân viên mới ===");
        repository.insert(new Employee(10, "Nguyen Van Lua", 8000));
        repository.findAll().forEach(System.out::println);

        System.out.println("\n=== Cập nhật nhân viên ===");
        repository.update(new Employee(10, "Lua Updated", 9500));
        System.out.println(repository.findById(10));

        System.out.println("\n=== Xóa nhân viên ===");
        repository.deleteById(10);
        repository.findAll().forEach(System.out::println);
    }
}
