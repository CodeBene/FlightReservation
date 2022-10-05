package com.example.flightreservationsystem;


public class FlightTestDrive {
    public static void main(String[] args) {
        Flight flight1 = new Flight(4,"Paris", "Rome", "17:00", "21:00", 500);
        Flight flight2 = new Flight(2, "Toronto", "Cancun", "9:00", "15", 600);
        Flight flight3 = new Flight(3, "Madrid", "Kuala Lumpur", "16:00","01:00", 800);
        EconomyPassenger passenger1 = new EconomyPassenger("Ramsay", "Gordon", "vegetarian");
        EconomyPassenger passenger2 = new EconomyPassenger("Tremblay", "Richard", "standard");

        //Flight fli1 = new Flight(4,"Paris", "Rome", "17:00", "21:00");

        flight1.displayListOfEconomyPassengers();
        flight1.addEconomyPassenger(passenger1);
        flight1.addEconomyPassenger(passenger2);
        FlightSchedule schedule = new FlightSchedule();
        schedule.addFlightToSchedule(flight1);
        schedule.addFlightToSchedule(flight2);
        schedule.addFlightToSchedule(flight3);
        passenger1.getPassportInfo("Italian", 200919);
        //System.out.println("Number of seats still available : " + flight1.getNbOfSeatsAvailable());
        schedule.sortFlights();
        //System.out.println("Flight schedule\n" + "-------------------------\n" + schedule.getFlightList());
        System.out.println(schedule);


    }
}