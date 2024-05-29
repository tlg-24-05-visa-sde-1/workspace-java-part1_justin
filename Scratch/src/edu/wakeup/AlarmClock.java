package edu.wakeup;

/*
 * Class definition to model the workings of an alarm clock.
 * This is sometimes called a "business" class, or "system" class, or "application" class.
 * It has NO main() method - classes like these don't.
 */
class AlarmClock {
    //class ("static") variables- good idea to put at top as a reminder that they live "above" the other variables
    //in the "shared" storage.
    //There is only one copy of these static variables that live in the "shared" area, NOT in each object.

    //saving our min and max snoozeIntervals to variables, so we can use them instead of writing 1 and 20 over and over
    //and we can change the variables here if we ever need to instead of going around and changing each 1 and 20 indiv.
    //NO MAGIC NUMBERS
    //the word "static" means that these values DON'T live in the indiv. instances of the classes, but in "shared class
    //storage".  They are now in the class-wide storage.  Italics is a visual indicator IntelliJ uses to show it's a
    //static variable.
    // We can make them public here because this is public information we want the clients to know, so it's safe.
    //When we have a public static final (class constants), there is a diff. naming convention, we do it in ALL CAPS with _ in between.
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;


    // properties or attributes - called "fields" or "instance variables". You can set the default value or not
    // by marking it private, we restrict direct access to it by the client
    private int snoozeInterval = 5;  //default value when client doesn't specify (instead of 0)



    //Constructors usually come after fields and before methods.  They are like methods that get called when
    //clients call new.  They can delegate, they can be overloaded.

    //we have to recreate the constructor that we were provided previously b/c once we create a constructor (below)
    //the provided default constructor is no longer given because the compiler sees that there is one already
    public AlarmClock(){
        //no operation constructor
    }
    public AlarmClock(int snoozeInterval){
        //delegate to setter for validation conversion
        setSnoozeInterval(snoozeInterval);
    }


    //functions or behaviors - called "methods" in Java
    //we're explicitly making the snooze method public and exposed to client
    //it's better to use the getter to access the snoozeInterval field instead of touching the field directly
    public void snooze(){
        System.out.println("Snoozing " + getSnoozeInterval() + " minute(s)");
    }

    //"Accessor" methods - getters and setters - provide "controlled access" to change the object's field
    //they provide access to a field's internal state
    //to auto generate getters and setters in IntelliJ right click,generate, getter/setter (cmd -n too)
    //we can do some validation here with if/else etc. statements



    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    /* "this" is how an object references itself means something like "inside me".  Here we do it because the parameter
     * matches the field name, this is legal and common, but you must use "this" keyword.
     */
    /*
     * Implement a business data constraint - must be between 1 and 20 (inclusive)
     */
    public void setSnoozeInterval(int snoozeInterval) {

        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) { //if it's valid - do this
            this.snoozeInterval = snoozeInterval;
        }
        else { // if not valid - error message - throw and exception (next week)
            System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                   ". Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " ." );


        }
    }

    /*
     * very common to have this method - Returns a string representation of this edu.wakeup.AlarmClock object
     * Generally includes teh name of the class (its type), and the values of its fields.
     * Method HAS to have this customary/standard name - toString() and HAS to be a public method.
     */
    public String toString(){
        return "edu.wakeup.AlarmClock: snoozeInterval= " + getSnoozeInterval();
    }


}