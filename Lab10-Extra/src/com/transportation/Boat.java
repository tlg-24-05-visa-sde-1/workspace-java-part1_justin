package com.transportation;

class Boat extends Vehicle {
    //constructor - the free constructor has no arguments but since the superClass Vehicle doesn't have a
    //no arguments constructor, we need to provide one here that matches it.
    public Boat(String vin) {
        super(vin);
    }

    @Override  //have to implement moveTo() from superclass/ but doesn't have to throw the exception (here it doesn't)
    public void moveTo(String location) {
        System.out.println("Going to " + location + " by boat.");
    }
}
