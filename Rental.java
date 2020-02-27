package org.acm.fowler;

class Rental {
    private Movie _movie;
    private int _daysRented = 0;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;  
    
    }
}
