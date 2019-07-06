package com.flight.booking.model;

/**
 * @author Nawaz
 *
 */
public class Flight{

    /**
     *
     */
    private String airlines;

    /**
     *
     */
    private String flightNumber;

    /**
     *
     */
    private String source;

    /**
     *
     */
    private String destination;

    /**
     *
     */
    private String departure;

    /**
     *
     */
    private Integer availableSeats;

    public Flight(String airlines, String flightNumber, String source,
            String destination, String departure, Integer availableSeats) {
        super();
        this.airlines = airlines;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departure = departure;
        this.availableSeats = availableSeats;
    }

    /**
     * @return the airlines
     */
    public String getAirlines() {
        return airlines;
    }

    /**
     * @param airlines the airlines to set
     */
    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the availableSeats
     */
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    /**
     * @param availableSeats the availableSeats to set
     */
    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

}
