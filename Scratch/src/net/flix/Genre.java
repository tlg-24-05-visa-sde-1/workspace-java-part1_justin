package net.flix;

public enum Genre {
    //each of these is calling the (private) ctor below.  We pass them a string because they're expecting on from the
    //below
    ROMANCE("Romance"),
    COMEDY("Comedy :)"),
    HORROR("HORROR"),
    ACTION("Action"),
    SCI_FI("Sci-Fi"),
    DRAMA("Drama"),
    SPORTS("Sports"),
    WESTERN("Western");

    //everything under here is regular class definition stuff, i.c. fields, ctors, methods.
    //the value for display is "effectively" final b/c there is no public setter, so we don't NEED to explicitly make it final
    final private String display;

    private Genre(String display) {  //you can say private here, but it is implicitly and necessarily private, so it's redudnant.
//        System.out.println("net.flix.Genre ctor called");
        this.display = display;
    }
    //we provide a getter - no setter for the display field
    public String getDisplay() {
        return display;
    }

    //since toString() is called automatically during concatenation, this will return the display automatically when we
    // call getGenre() in net.flix.Movie class when we call toString()
    public String toString(){
        return display;
    }
}