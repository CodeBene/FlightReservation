package com.example.flightreservationsystem;

public class EconomyPassenger extends Passenger implements Comparable<Passenger>{

    int seatNumber;

    public EconomyPassenger(String lName, String fName, String mealPreference) {
        super(lName, fName, mealPreference);
    }

    public void setPassengerSeat(int seatAssigned){
        this.seatNumber = seatAssigned;
    };

    public int getSeatNumber(){
        return this.seatNumber;
    }

    @Override
    public String getMeal(int mealChoice) {
        String meal = switch(mealChoice){
            case 1 -> "Chicken with mushroom";
            case 2 -> "Vegetarian sate on rice";
            default -> "Standard meal";
        };
        return meal + "including a glass of wine and a chocolate cake";
    }

    @Override
    public String toString() {
        return "Economy Passenger" + super.toString();
    }


    @Override
    public int compareTo(Passenger o) {
        return 0;
    }
}