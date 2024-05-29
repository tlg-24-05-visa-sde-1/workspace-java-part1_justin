package net.fishingrod.test;

import net.fishingrod.FishingRod;

class FishingRodValidationTest {
    public static void main(String[] args) {
        //create object instance
        FishingRod fishingRod = new FishingRod();

        //boundary testing for length
        fishingRod.setLength(0);
        System.out.println("fishingRod: " + fishingRod);  //should produce error

        fishingRod.setLength(1);
        System.out.println("fishingRod: " + fishingRod);  //should be valid and set Length to 1
    }
}