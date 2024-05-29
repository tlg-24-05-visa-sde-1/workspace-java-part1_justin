import java.util.Arrays;

/*
 * Application class to model the workings of a television set.
 * NO main() method here.
 */
class Television {
    // class ("static") variables - one copy, stored in the class-wide common shared area, not in each instance
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    //enum class
    DisplayType display = DisplayType.LED;

    //instance counter - triggered when an instance is created in our first no arg constructor our other constructors are
    //sent up to it wth the this() and this(brand) methods.  We make it private so clients can't mess with the count, but
    //they can get it with the public getter;
    private static int  instanceCount = 0;

    //public static getter method for the instanceCount variable.  *Remember static methods only have access to
    //what is in the shared storage and not anything in a particular instance.
    public static int getInstanceCount() {
        return instanceCount;
    }

    //properties or attributes - called "instance variables" or "fields"
    //remember String or class type is NULL by default and int is 0 and double is 0.0
    private String brand;
    private int volume = 1;

    //mute fields
    public boolean isMuted;
    private int oldVolume;

    //constructors  (telescoping constructors - get bigger as they go down).
    //the rest of the constructors will inherit the initial settings.
    public Television(){
        instanceCount++;
        // for ex. 10 lines of code to initialize the system, calibrate the colors, etc.
    }

    //this() will send the constructor and any subsequent constructors that call it up to the first constructor
    //with the initial settings
    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume){
        this(brand);     //delegate to brand ctor above me for handling brand
        setVolume(volume);  //handle volume myself by delegating directing to volume's setter
    }

    public Television(String brand, int volume, DisplayType displayType ){
        this(brand, volume);
        setDisplay(displayType);
    }

    //instance methods (as opposed to static methods that are in shared storage).
    //functions or behaviors - called "methods" in Java.  We can call these "business" or action methods.
    //this is different from the accessor methods that just get/set values.
    public void turnOn(){
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
        System.out.println(verifyInternetConnection());
    }
    public void turnOff(){
        System.out.println("Shutting down...goodbye");
    }

    public void mute(){
        if(!isMuted){
            oldVolume=getVolume();
            volume = 0;
            isMuted= true;
        }
        else if (isMuted){
            setVolume(oldVolume);
            isMuted= false;
        }
    }

    //accessor methods - these provide "controlled access" to the object's fields
    //these functions operate inside the object (instances of the classes)
    //if you only have a getter and no setter - Read Only
    public String getBrand() {
        return brand;
    }
    //basic setter validation - data validation to restrict brands to the following, if not throw error message
    //.equalsIgnoreCase is case-insensitive and .equals is not.  We could also do a switch statement here, but
    // you can't make it case-insensitive if you do

    //"Samsung", "LG", "Sony", "Toshiba"
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    //making this a static method means we DON'T have to have an instance to call it.  It also means the answer will not vary
    //based on instance
    private static boolean isValidBrand(String brand) {
        for (int i = 0; i < VALID_BRANDS.length; i++) {
            if (brand.equalsIgnoreCase(VALID_BRANDS[i])) {
                return true;
            }
        }
        return false;
        //TODO - advanced forEach loop
        //this checks all the VALID_BRANDS one by one
//        for(String validBrand: VALID_BRANDS) {
//            if (brand.equals(validBrand)) {
//                this.brand = brand;
//            } else {
//                System.out.println("Invalid brand....");
//            }
//        }
    }
    public void setBrand(String brand) {
        boolean validBrand = isValidBrand(brand);
        if (validBrand){
            this.brand = brand;
        }
        else {System.out.println("Invalid Brand: Brand must be one of." + Arrays.toString(VALID_BRANDS));
        }
        /*
        We can do this all in setBrand as follows:
        boolean isValid = false;

        for(String validBrand: VALID_BRANDS){
        if (brand.equals(validBrand)){
        this.brand = brand;
        isValid= true;
        break;
        }}
        if (!isValid){
         print error message here
         */
    }

//        if(brand.equalsIgnoreCase("Samsung") || brand.equalsIgnoreCase("LG") || brand.equalsIgnoreCase("Sony") || brand.equalsIgnoreCase("Toshiba")){
//            this.brand = brand;
//        }
//        else{
//            System.out.println("Invalid Brand: Brand must be Samsung, LG, Sony or Toshiba.");
//        }
    //using switch to do the same.
        /* switch (brand) {
                case "Samsung":
                case "LG":
                case "Sony":
                case "Toshiba":
                    this.brand = brand;
                    break;
                default:
                    System.out.println("Invalid brand: " + brand + "." + " Valid brands are: Samsung, LG, Sony, Toshiba.":
        */


    public int getVolume() {
        return volume;
    }

    //basic setter validation - data validation with if else statements to make sure volume
    // is within range of MIN and MAX_VOLUME.  Do validation of variables (private) in setters.
    public void setVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.volume = volume;
            isMuted=false;
            System.out.println("Volume set to " + volume);
        }
        else{
            System.out.println("Invalid entry: Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    //private and can't be called from the TelevisionClient (outsider)
    private boolean verifyInternetConnection(){
        return true;
    }

    /*again, better to get private fields with getter than accessing private field directly, with brand and volume
     *variable names.  We use volumeString variable with a ternary operator to say muted or the volume
     */


    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "TV" + " Brand: " + getBrand() + ", Volume: " + volumeString + ", Display Type: " + getDisplay();
    }

    //getMuted getter, we can name is isMuted or getIsMuted b/c it's a boolean getter
    public boolean isMuted() {
        return isMuted;
    }
}