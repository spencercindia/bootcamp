package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDaoTests extends BaseDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;
    private Park testPark;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);
        testPark = new Park(4, "TEST", LocalDate.now(), 12, true);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        Park park = sut.getPark(1);
        assertParksMatch(PARK_1, park);

        Park park2 = sut.getPark(2);
        assertParksMatch(PARK_2, park2);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        Assert.assertNull(sut.getPark(4));
        Assert.assertNull(sut.getPark(100));
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {
        List<Park> parks = sut.getParksByState("AA");

        Assert.assertEquals(2, parks.size()); // becuase the test-data.sql file

        List<Park> parks2 = sut.getParksByState("CC");
        Assert.assertEquals(1, parks2.size());
    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        List<Park> parks = sut.getParksByState("OO");

        Assert.assertEquals(0, parks.size());

        List<Park> parks2 = sut.getParksByState("UH");

        Assert.assertEquals(0, parks2.size());
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        Park createdPark = sut.createPark(testPark);
        Long newId = createdPark.getParkId();

        Assert.assertTrue(newId > 0);
        testPark.setParkId(newId);

        assertParksMatch(testPark, createdPark);
    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        Assert.fail();
    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        Park parkToUpdate = sut.getPark(1);

        parkToUpdate.setParkName("Updated");
        parkToUpdate.setArea(10);
        parkToUpdate.setHasCamping(true);
        parkToUpdate.setDateEstablished(LocalDate.now());
        sut.updatePark(parkToUpdate);

        Park parkToCompare = sut.getPark(1);
        assertParksMatch(parkToUpdate, parkToCompare);

    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        sut.deletePark(1);

        Park parkWasDeleted = sut.getPark(1);

        Assert.assertNull(parkWasDeleted);
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        Park park = sut.createPark(testPark);
        Long newId = park.getParkId();

        sut.addParkToState(newId, "CC");
        List<Park> parks = sut.getParksByState("CC");

        Assert.assertEquals(2, parks.size());
        assertParksMatch(park, parks.get(1));
    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        sut.removeParkFromState(1, "AA");
        Assert.assertEquals(1, sut.getParksByState("AA").size());
    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

}
