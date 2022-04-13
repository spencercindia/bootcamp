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
		return new ArrayList<>();
	}

	@Override
	public Project createProject(Project newProject) {
		Project project = new Project();
		String sql = "insert into project (name, from_date, to_date) values (?, ?, ?) returning project_id;";

		if (newProject.getFromDate() == null) {
			if (newProject.getToDate() == null) {
				Long newProjectId = jdbcTemplate.queryForObject(sql, Long.class, newProject.getName(), null, null);
				project.setId(newProjectId);
			} else {
				Long newProjectId = jdbcTemplate.queryForObject(sql, Long.class, newProject.getName(), null, newProject.getToDate());
				project.setId(newProjectId);
			}
		} else {
			Long newProjectId = jdbcTemplate.queryForObject(sql, Long.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
			project.setId(newProjectId);
		}
		return project;
	}

	@Override
	public void deleteProject(Long projectId) {

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
