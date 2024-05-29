package net.fishingrod.client;

import net.fishingrod.FishingRod;
import net.fishingrod.FishingRodType;

class FishingRodClient {

    public static void main(String[] args) {

        //create an instance of fishingrod.FishingRod class and set properties
        FishingRod fishingRod1 = new FishingRod();
        fishingRod1.setBrand("DragonTail");
        fishingRod1.setModel("Shadowfire 365");
        fishingRod1.setFixedLine(true);
        fishingRod1.setType(FishingRodType.FLY_ROD);
        fishingRod1.setLength(10);
        fishingRod1.setTelescoping(true);


        //creating instance of FishingRod with 1 param constructor
        FishingRod fishingRod2 = new FishingRod("Orvis");

        //creating instance of FishingRod with 2 param constructor
        FishingRod fishingRod3 = new FishingRod("Big Fish Co,", "Saltie");

        //creating instance of FishingRod with 3 param constructor
        FishingRod fishingRod4 = new FishingRod("Tenkara Rod Co.", "Sierra", 10.5);

        //calling public cast() method on the FishingRod objects.  We cast fishingRod1 many times to see if
        //the number of fish caught increments until 10 and then says that they've reached their limit and resets to 0.
        System.out.println();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.fixRod();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.fixRod();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        fishingRod1.cast();
        System.out.println();


        //call toString()
        System.out.println(fishingRod1);


        //testing constructors for rod4 and rod5 and rod6 with toString()
        System.out.println(fishingRod2);
        System.out.println(fishingRod3);
        System.out.println(fishingRod4);

    }
}