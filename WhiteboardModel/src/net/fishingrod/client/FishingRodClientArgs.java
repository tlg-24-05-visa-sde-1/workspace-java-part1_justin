package net.fishingrod.client;

import net.fishingrod.FishingRod;

class FishingRodClientArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "Usage: java net.fishingrod.client.FishingRodClientArgs <brand> <model> <length>";
            String example = "Example: java DragonTail HellBender 12";
            String note = "Note: Length is in feet.";

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
        } else {
            System.out.println("You provided" + args.length + " arguments");

            //convert string to double b/c constructor is expecting a double
            double length = Double.parseDouble(args[2]);
            FishingRod fishingRod = new FishingRod(args[0], args[1], length);
            System.out.println(fishingRod);
        }
    }

}