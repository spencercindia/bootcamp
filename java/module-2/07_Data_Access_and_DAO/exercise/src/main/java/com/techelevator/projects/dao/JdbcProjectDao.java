package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(Long projectId) {
		Project project = new Project();

		String sql = "select * from project where project_id = ?;";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);
		if (result.next()) {
			project = mapRowToProject(result);
		} else
			project = null;
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<>();
		String sql = "select * from project;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			projects.add(mapRowToProject(results));
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		Project project = new Project();
		String sql = "insert into project (name, from_date, to_date) values (?, ?, ?) returning project_id;";
		Long newProjectId = jdbcTemplate.queryForObject(sql, Long.class, newProject.getName(),
				newProject.getFromDate(), newProject.getToDate());
		newProject.setId(newProjectId);
		return newProject;
	}

	@Override
	public void deleteProject(Long projectId) {
		String sql = "delete from project_employee where project_id = ?;";
		jdbcTemplate.update(sql, projectId);
		sql = "delete from timesheet where project_id = ?;";
		jdbcTemplate.update(sql, projectId);
		sql = "delete from project where project_id = ?;";
		jdbcTemplate.update(sql, projectId);
	}

	private Project mapRowToProject(SqlRowSet results) {
		Project project = new Project();
		project.setId(results.getLong("project_id"));
		project.setName(results.getString("name"));
		if (results.getDate("from_date") != null) {
			project.setFromDate(results.getDate("from_date").toLocalDate());
		}
		if (results.getDate("from_date") != null) {
			project.setToDate(results.getDate("to_date").toLocalDate());
		}
		return project;
	}

}
