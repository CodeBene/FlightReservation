package com.example.flightreservationsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightSchedule{


    private List<Flight> flightList;
    public FlightSchedule() {

        this.flightList = new ArrayList<Flight>();
    }

    public void addFlightToSchedule(Flight flight){
        this.flightList.add(flight);
    }

    public void cancelFlight(Flight flight)    {
        this.flightList.remove(flight);
    }
    public void sortFlights() {
        Collections.sort(this.flightList);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public int getNumberOfFlights(){
        return flightList.size();
    }

    @Override
    public String toString() {
        return "FlightSchedule\n----------------------------------------------" + getFlightList();

    }

}