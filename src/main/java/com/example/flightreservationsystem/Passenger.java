package com.example.flightreservationsystem;

import java.util.List;

public abstract class Passenger implements InternationalFlight, Comparable<Passenger>{
    private String lName;
    private String fName;

    private int seatNumber;
    private String mealPreference;

    public Passenger(String lName, String fName, String mealPreference) {
        this.lName = lName;
        this.fName = fName;
        this.mealPreference = mealPreference;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public abstract String getMeal(int mealChoice);


    @Override
    public void getPassportInfo(String nationality, int passportNb) {
        System.out.println("Nationality" + nationality + "\n" + "Passport number" + passportNb);
    }
    @Override
    public String toString() {
        return  "Last Name: " + lName +
                ", First Name: " + fName +
                ", Meal Preference: " + mealPreference;
    }

}
