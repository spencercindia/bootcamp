package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "select * from employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employeesByName = new ArrayList<>();
		String sql = "select * from employee where (first_name ilike ? and last_name ilike ?);";
		SqlRowSet results;
		if (firstNameSearch.length() == 0) {
			if (lastNameSearch.length() == 0) {
				sql = "select * from employee";
				results = jdbcTemplate.queryForRowSet(sql);
			} else {
				sql = "select * from employee where last_name ilike ?;";
				results = jdbcTemplate.queryForRowSet(sql, "%" + lastNameSearch + "%");
			}
		} else {
			results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		}
		while (results.next()) {
			employeesByName.add(mapRowToEmployee(results));
		}
		return employeesByName;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employeesById = new ArrayList<>();
		String sql = "select * from employee join project_employee using(employee_id) where project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			employeesById.add(mapRowToEmployee(results));
		}
		return employeesById;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "insert into project_employee (project_id, employee_id) values (?, ?);";
		if (projectId != null && employeeId != null) {
			jdbcTemplate.update(sql, projectId, employeeId);
		}

	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sql = "delete from project_employee where employee_id = ?;";
		jdbcTemplate.update(sql, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employeeList = new ArrayList<>();
		String sql = "select * from employee left join project_employee using(employee_id) where project_id is null";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employeeList.add(mapRowToEmployee(results));
		}
		return employeeList;
	}

	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee employee = new Employee();
		employee.setId(results.getLong("employee_id"));
		employee.setDepartmentId(results.getLong("department_id"));
		employee.setFirstName(results.getString("first_name"));
		employee.setLastName(results.getString("last_name"));
		employee.setBirthDate(results.getDate("birth_date").toLocalDate());
		employee.setHireDate(results.getDate("hire_date").toLocalDate());
		return employee;
	}
}
