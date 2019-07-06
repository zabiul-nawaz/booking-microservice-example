package com.flight.booking.repo;

import java.util.List;

import com.flight.booking.model.Flight;

/**
 * @author Nawaz
 *
 */
public interface FlightDao {

    /**
     * @return
     */
    List<Flight> getAllFlights();

    /**
     * @param number
     * @return
     */
    Flight getFlight(String number);
}
