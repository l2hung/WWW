package fit.iuh.se.thymeleaf.repository;

import fit.iuh.se.thymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Hàm tìm kiếm theo keyword (first name, last name, hoặc email)
    @Query("SELECT e FROM Employee e WHERE " +
            "LOWER(e.firstName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(e.lastName) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "LOWER(e.email) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Employee> searchByKeyword(String keyword);
}