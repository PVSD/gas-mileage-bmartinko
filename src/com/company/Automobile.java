package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {
    public int miles = 0;
    public int gallons = 0;
    public int milesPerGallon = 0;

    public Automobile (int mpg){
        milesPerGallon = mpg;
    }
    public void takeTrip (int t){
        gallons = gallons - (t/milesPerGallon);
    }
    public void fillUp (int gas){
        gas += gallons;
    }
    public double reportFuel (){
        return gallons;
    }
}
