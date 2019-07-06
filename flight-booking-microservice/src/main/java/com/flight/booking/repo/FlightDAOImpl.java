package com.flight.booking.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.flight.booking.model.Flight;

/**
 * @author Nawaz
 *
 */
@Repository ("flightDao")
public class FlightDAOImpl implements FlightDao {

    /**
     *
     */
    private Map<String, Flight> flightsByNumber = new HashMap<String, Flight>();



    public FlightDAOImpl() {
        flightsByNumber.put("AI_1", new Flight("AI", "AI_1", "JFK", "KL", "14:00 GMT Sunday, 30th June 2019", 5));
        flightsByNumber.put("BA_2", new Flight("BA", "BA_2", "DE", "PH", "18:00 GMT Tuesday, 2nd July 2019", 3));
        flightsByNumber.put("QA_3", new Flight("QA", "QA_3", "DOH", "DEL", "21:00 GMT Monday, 9th July 2019", 15));
    }

    /* (non-Javadoc)
     * @see com.flight.booking.repo.FlightRepository#getAllFlights()
     */
    @Override
    public List<Flight> getAllFlights() {
        return new ArrayList<Flight>(flightsByNumber.values());
    }

    /* (non-Javadoc)
     * @see com.flight.booking.repo.FlightRepository#getFlight(java.lang.String)
     */
    @Override
    public Flight getFlight(String number) {
        return flightsByNumber.get(number);
    }

}
