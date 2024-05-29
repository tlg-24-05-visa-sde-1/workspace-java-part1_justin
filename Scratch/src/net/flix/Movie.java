package net.flix;

public class Movie {
    //instance variables or field (almost always private)
    private String title;

    //Use primitive wrappers here, so they default to null if not explicitly entered instead of 0 and 0.0.
    //This lets us know whether or not they are 0 and 0.0 because they weren't specified or b/c the values entered
    // were 0 or 0.0.
    private Integer releaseYear;
    private Double revenue;

    //our enum properties.  If they are not specified, they are null (b/c they are class types).
    private Rating rating;
    private Genre genre;

    //Constructors - get called when clients say "new", often public,  We can remove this on argument in order to
    //enforce a rule that requires creating objects with a title.
    //    public net.flix.Movie(){ //constructor 1
    //            //no-op
    //    }

    public Movie(String title){  //constructor 2
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);  //delegates to the ctor above
        setGenre(genre);  //this ctor will handle genre by calling setter
    }

        //look for overlapping parameters in constructors.
    public Movie( String title, Integer releaseYear, Double revenue){   //constructor 3
        this(title);    //delegates to the other constructor above which handles title (DRY),
        // so you're not repeating your code (DRY).  this(title) called the above constructor which then calls setTitle()

        //delegate to the setters for any data validation/conversion they might be doing now or in the future
        // another way to do this is this.title = title, but this way you're throwing away any validation you have
        setReleaseYear(releaseYear);     //call your own setters (if you have them)// !! For validation/conversion
        setRevenue(revenue);
    }

    //constructor to take all 5 property values
    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre){
        this(title, releaseYear, revenue);  //delegate to 3-arg ctor above me for these three
        setRating(rating);  //this ctor handle rating and genre myself by dumbing them to the setters
        setGenre(genre);
    }


    //"action" methods - would be play(), pause(), stop(), rewind(), fastForward(), etc.



    //"assessor" methods, aka, get/set methods, aka getters and setters - provide controlled access to object's fields
    //set with command + n and select all methods you want getters/setters for


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //toString() method - generally better to call the getter to get private fields (be better encapsulated)
    // our getRating() and getGenre() objects are converted to Strings by toString() during concatenation.
    //we use getGenre() to get the net.flix.Genre object and then call .getDisplay() to access the display.  We adjusted
    //the net.flix.Genre enum to show display when toString() is called on getGenre(), so we get rid of .getDisplay();
    public String toString(){

        //TODO: if revenue is null, use %s for that, otherwise use %f,.2f
        if (revenue == null){
            return String.format("net.flix.Movie: title=%s, releaseYear=%s, revenue=%s, rating=%s, genre=%s",
                    getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
        }
        else {
            return String.format("net.flix.Movie: title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s",
                    getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
        }

//    return "net.flix.Movie: " + " title= " + getTitle() + ", " + "releaseYear= "
//            +getReleaseYear() + ", " + "revenue= " +getRevenue() + ", " + "rating= " +getRating() + ", "
//            + "genre= " + getGenre();
    }
}