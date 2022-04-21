package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.exception.HotelNotFoundException;
import com.techelevator.reservations.exception.ReservationNotFoundException;
import com.techelevator.reservations.model.Reservation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ReservationController {

    private ReservationDao reservationDao;

    public ReservationController(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    /**
     * Create a new reservation for a given hotel
     *
     * @param reservation
     * @param hotelID
     */
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@Valid @RequestBody Reservation reservation, @PathVariable("id") int hotelID)
            throws HotelNotFoundException {
        return reservationDao.create(reservation, hotelID);
    }


    /**
     * List of reservations by hotel
     *
     * @param hotelID
     * @return all reservations for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable("id") int hotelID) throws HotelNotFoundException {
        return reservationDao.findByHotel(hotelID);
    }


    /**
     * Get a reservation by its id
     *
     * @param id
     * @return a single reservation
     */
    @RequestMapping(path = "reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) throws ReservationNotFoundException {
        return reservationDao.get(id);
    }


    /**
     * Returns all reservations in the system
     *
     * @return all reservations
     */
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }


    /**
     * @param id
     * @param reservation
     */

    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.PUT)
    public Reservation update(@RequestBody Reservation reservation, @PathVariable int id) throws ReservationNotFoundException {
        return reservationDao.update(reservation, id);
    }

    /**
     * @param id
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) throws ReservationNotFoundException {
        reservationDao.delete(id);
    }
}
