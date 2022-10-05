package com.example.flightreservationsystem;

public class BusinessPassenger extends Passenger implements Comparable<Passenger>{

    public BusinessPassenger(String lName, String fName, String mealPreference) {
        super(lName, fName, mealPreference);
    }


    @Override
    public String getMeal(int mealChoice) {
        String meal = switch(mealChoice){
            case 1 -> "Chicken with mushroom";
            case 2 -> "Beef stroganoff";
            case 3 -> "Vegetarian sate on rice";
            default -> "any meal";
        };
        return meal + " including a glass of champagne and a fancy cake";
    }
    @Override
    public String toString() {
        return "Business Passenger" + super.toString();
    }

    @Override
    public int compareTo(Passenger o) {
        return 0;
    }
}