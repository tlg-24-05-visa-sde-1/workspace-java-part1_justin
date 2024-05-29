package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    //main method (type main for shortcut)
    public static void main(String[] args) {

        //Constructors- instead of setting every field like this.  We need to pass the ctor the title since we
        //deleted the no arg constructor.
        Movie movie1 = new Movie("Twilight");
        movie1.setReleaseYear(2008);
        movie1.setRevenue(5_280_000_000.0);
        movie1.setRating(Rating.PG13);
        movie1.setGenre(Genre.ROMANCE);

        //automatically calling toString()
        System.out.println(movie1);

        //To be able to do this, we need a CONSTRUCTOR.  This way we save lines of code.
        //Here we use the constructor we made that takes 3 args
        Movie movie2 = new Movie("Oppenheimer", 2023, 125.0, Rating.R, Genre.DRAMA);

        System.out.println(movie2);

        Movie movie3 = new Movie("Stoopin", Genre.DRAMA);
        System.out.println(movie3);
        }

    }
