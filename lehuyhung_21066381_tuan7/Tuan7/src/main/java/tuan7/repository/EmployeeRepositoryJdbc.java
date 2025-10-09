package tuan7.repository;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tuan7.entity.Employee;

import java.util.List;

@Repository
public class EmployeeRepositoryJdbc {
    private final JdbcTemplate jdbcTemplate;

    public EmployeeRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // CREATE
    public int insert(Employee e) {
        String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, e.getId(), e.getName(), e.getSalary());
    }

    // READ (ALL)
    public List<Employee> findAll() {
        String sql = "SELECT * FROM employee";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    // READ (ONE)
    public Employee findById(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), id);
    }

    // UPDATE
    public int update(Employee e) {
        String sql = "UPDATE employee SET name=?, salary=? WHERE id=?";
        return jdbcTemplate.update(sql, e.getName(), e.getSalary(), e.getId());
    }

    // DELETE
    public int deleteById(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }
}
