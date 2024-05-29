package net.fishingrod;

/*
 * class definition of FishingRod to define its properties and methods
 */
public class FishingRod {
    //static properties
    public static int minLength = 1;

    //properties
    private String brand;
    private String model;
    private double length;
    private boolean isTelescoping;
    private boolean isFixedLine;
    private int totalFishCaught = 0;
    private boolean isBroken;

    //ENUM
    private FishingRodType fishingRodType;

    //constructors
    public FishingRod() {
        //no-op
    }

    public FishingRod(String brand) {
        setBrand(brand);
    }

    public FishingRod(String brand, String model) {
        this(brand);
        setModel(model);
    }

    public FishingRod(String brand, String model, double length) {
        this(brand);
        setModel(model);
        setLength(length);
    }

    //methods
    //cast method calls getBite() if isBroken is false and if true, prompts to fix rod
    public void cast() {
        if (isBroken) {
            System.out.println("You need to fix your rod before you can cast again!!!");
        } else {
            System.out.println("You cast your " + brand + " " + model + " rod.");
            getBite();
        }
    }

    //generates a randomNum from 0 to 99 (inclusive) for logic in getBite()
    private int randoNumGen() {
        double num = Math.random() * 100;
        int result = (int) num;
        return result;
    }

    //getBite() method for someone to either catch a fish, break rod or let it off the hook.
    private void getBite() {
        System.out.println("You got a bite!");
        int number = randoNumGen();
        if (number < 30) {
            letFishOffHook();
        } else if (number >= 30 && number <= 80) {
            catchFish();
        } else {
            breakRod();
        }
        System.out.println();
    }

    //generates a random fish size from 0.0 to 30.0 (not inclusive), limits number returned to a tenth.
    private double randoFishSizeGen() {
        return Math.random() * 30;
    }

    //fish string to pick a random fish.
    private String[] fishies = {"bass", "rainbow trout", "carp", "blue gill", "sunfish"};

    //random number generator to choose a fish from the array above
    private int randoFishGen() {
        return (int) (Math.random() * fishies.length);
    }

    //runs randoFishGen() and randoFishSizeGen() to get a fish and size that is caught.  Increments totalFishCaught by
    //1 for each unless 10 fish are caught and then it prints that limit has been reached and resets totalFishCaught to 0.
    public void catchFish() {
        int fishNum = randoFishGen();
        double fishSize = randoFishSizeGen();
        String fish = fishies[fishNum];
        setTotalFishCaught();
        if (totalFishCaught >= 10) {
            System.out.printf("You've caught a %,.2f pound %s You've reached your limit of %s, time to go home!\n", fishSize, fish, getTotalFishCaught());
            System.out.println();
            totalFishCaught = 0;
        } else {
            System.out.printf("Woohoo, you caught a %,.2f pound %s :) ", fishSize, fish);
            System.out.println("You've caught " + getTotalFishCaught() + " fish!!!");
            System.out.println();
        }
    }

    public void breakRod() {
        setBroken(!isBroken);
        System.out.println("The fish was too big!  You broke your " + brand + " " + model + " rod >:(\n" +
                "You might want to fix it!");
        System.out.println();
    }

    public void fixRod() {
        System.out.println();
        setBroken(!isBroken);
        System.out.println("Great, you fixed your rod! Now, get back to fishing!!!!");
        System.out.println();
    }

    public void letFishOffHook() {
        System.out.println("The fish got off the hook :(");
        System.out.println();
    }

    //getters and setters
    public int getTotalFishCaught() {
        return totalFishCaught;
    }

    //setter to increment totalFishCaught by one each time catchFish() is called
    public void setTotalFishCaught() {
        totalFishCaught++;
    }

    public boolean getFixedLine() {
        return isFixedLine;
    }

    public void setFixedLine(boolean fixedLine) {
        isFixedLine = fixedLine;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = !isBroken;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= minLength) {
            this.length = length;
        } else {
            System.out.println("Invalid length: length must be at least" + minLength);
        }
    }

    public boolean getIsTelescoping() {
        return isTelescoping;
    }

    public void setTelescoping(boolean telescoping) {
        isTelescoping = telescoping;
    }

    public FishingRodType getType() {
        return fishingRodType;
    }

    //make an array of the types and then iterate over it in setType to not have "Magic Strings" (commented out below)
//    private static final FishingRodType[] VALID_TYPES = {FishingRodType.SPINNING_ROD, FishingRodType.FLY_ROD, FishingRodType.CASTING_ROD};
    private static final FishingRodType[] VALID_TYPES = FishingRodType.values();


    public void setType(FishingRodType fishingRodType) {
        this.fishingRodType = fishingRodType;
    }

    // toString()
    public String toString() {
        return "Fishing Rod: " + " brand: " + getBrand() + ", model: " + getModel() + ", length " + getLength() + "ft" +
                ", isFixedLine: " + getFixedLine() + ", isTelescoping" + getIsTelescoping() + ", type: "
                + getType() + ", isBroken: " + isBroken() + ", totalFishCaught: " + getTotalFishCaught() + ".";
    }

}