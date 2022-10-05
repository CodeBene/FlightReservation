package com.example.flightreservationsystem;

import java.util.Arrays;

public class Flight implements Comparable<Flight> {
    private int flightNb;
    private String departureCity;
    private String destinationCity;
    private String departureTime;
    private String arrivalTime;
    private int nbOfSeatsReserved;
    private int airplaneEconomyCapacity = 60;
    //private EconomyPassenger seatsInEconomy[];

    private EconomyPassenger listOfEconomyPassengers[];
    private double price;

    public Flight(int flightNb, String departureCity, String destinationCity, String departureTime, String arrivalTime, double price) {
        this.flightNb = flightNb;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.listOfEconomyPassengers = new EconomyPassenger[airplaneEconomyCapacity];
        this.price = price;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public EconomyPassenger[] getListOfEconomyPassengers(){
        return listOfEconomyPassengers;
    }

    public int getFlightNb() {
        return flightNb;
    }



    public int getNbOfSeatsReserved() {
        return nbOfSeatsReserved;
    }

    public void setNbOfSeatsReserved(int nbOfSeatsReserved) {
        this.nbOfSeatsReserved = nbOfSeatsReserved;
    }
// public void reserveEconomySeat(Passenger p){
    //   nbOfSeatsAvailableEconomy -= 1;
    // nbOfSeatsReservedEconomy += 1;
    // int seatToReserve = nbOfSeatsReservedEconomy;
    // p.setPassengerSeat(seatToReserve);
    //this.seatsInEconomy[seatToReserve] = p;
    //}

    //public int getNbOfSeatsReservedEconomy(){

    //}
    public void addEconomyPassenger(EconomyPassenger p){
        if (listOfEconomyPassengers.length > airplaneEconomyCapacity)
            System.out.println("This flight is full.");
        else {
            nbOfSeatsReserved++;
            this.listOfEconomyPassengers[nbOfSeatsReserved] = p;
            p.setPassengerSeat(nbOfSeatsReserved);
            //decreaseNbOfSeatsAvailable(1);

        }
    }
   // public void calculate() {
     //   for (int i = 0; i > 10; ) {
       //     i = i++;
         //   System.out.println("blabla");
       // }
    //}
    public void displayListOfEconomyPassengers() {
        for (int i = 0; i < listOfEconomyPassengers.length; i++)
            if (this.listOfEconomyPassengers[i] != null)
                System.out.println("Passenger " + (i + 1) + " -> " + this.listOfEconomyPassengers[i].getfName() + "" + this.listOfEconomyPassengers[i].getlName());
    }
    @Override
    public int compareTo(Flight flight) {
        if(flightNb == flight.flightNb)
            return 0;
        else
        if (flightNb > flight.flightNb)
            return 1;
        else
            return -1;
    }
    // public void sortPassengers() {
    //   Collections.sort(this.listOfEconomyPassengers);
    //}

    //display for clients
    public String displayFlightInfo(){
        return "\nFlight number" + flightNb +
                "\ndepartureCity='" + departureCity + '\'' +
                "\ndestinationCity='" + destinationCity + '\'' +
                "\ndepartureTime='" + departureTime + '\'' +
                "\narrivalTime='" + arrivalTime + '\'' +
                "\nbOfSeatsReserved=" + nbOfSeatsReserved +
                "\nairplaneEconomyCapacity=" + airplaneEconomyCapacity +

                "\nprice=" + price;
    }

    //display for admin
    @Override
    public String toString() {
        return  "\nFlight number: " + flightNb +
                "\nDeparture City:" + departureCity +
                "\nDestination City:" + destinationCity +
                "\nDeparture Time:" + departureTime  +
                "\nArrival Time: " + arrivalTime +
                "\nSeats Reserved: " + nbOfSeatsReserved +
                "\nEconomy Class Capacity: " + airplaneEconomyCapacity +
                "\nPrice: " + price +
                "\n--------------------------------";
    }

// public void setPrice(String passengerClass) {
    //   if(passengerClass == "Economy"){
    //     price = getEconomyPrice();
    // }
    //if(passengerClass == "Business"){
    //  price = getBusinessPrice();
    // }
    // this.price = price;
    //}





    //public void decreaseNbOfSeatsAvailable(int nbOfSeatstoReserve){
    //  nbOfSeatsAvailable = nbOfSeatsAvailable - nbOfSeatstoReserve;
    //}


    //public int getNbOfSeatsAvailable(){
    //  nbOfSeatsAvailable = this.airplaneCapacity - this.nbOfSeatsReserved;
    //  return nbOfSeatsAvailable;
    //}



}