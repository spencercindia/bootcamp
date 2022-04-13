package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(long parkId) {
        Park park = null;
        String sql = "select park_id, park_name, date_established, area, has_camping from park where park_id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, parkId);
        if (result.next()) {
            park = mapRowToPark(result);
        }
        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        List<Park> parks = new ArrayList<>();
        String sql = "select * from park join park_state using(park_id) where state_abbreviation = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        while (results.next()) {
            parks.add(mapRowToPark(results));
        }
        return parks;
    }

    @Override
    public Park createPark(Park park) {
        String sql = "insert into park (park_name, date_established, area, has_camping)\n" +
                "values (?, ?, ?, ?)\n" +
                "returning park_id;";
        Long newParkId = jdbcTemplate.queryForObject(sql, Long.class, park.getParkName(), park.getDateEstablished(),
                park.getArea(), park.getHasCamping());

        return getPark(newParkId);
    }
// ****** need to finish update?
    @Override
    public void updatePark(Park park) {
        String sql = "update park set " +
                "park_name = ? " +
                "area = ? " +
                "date_established = ? " +
                "has_camping = ? " +
                "where park_id = ? ";
        jdbcTemplate.update(sql, park.getParkName(), park.getArea(),
                park.getDateEstablished(), park.getHasCamping(), park.getParkId());
    }

    @Override
    public void deletePark(long parkId) {
        String sql = "delete from park_state where park_id = ?";
        jdbcTemplate.update(sql, parkId);

        sql = "delete from park where park_id = ?";
        jdbcTemplate.update(sql, parkId);
    }

    @Override
    public void addParkToState(long parkId, String stateAbbreviation) {
        String sql = "insert into park_state (park_id, state_abbreviation) values (?, ?,)";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);
    }

    @Override
    public void removeParkFromState(long parkId, String stateAbbreviation) {
        String sql = "delete from park_state where park_id = ? and state_abbreviation = ?";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);
    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();
        park.setParkId(rowSet.getLong("park_id"));
        park.setParkName(rowSet.getString("park_name"));
        park.setArea(rowSet.getLong("area"));
        park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        park.setHasCamping(rowSet.getBoolean("has_camping"));

        return park;
    }
}
