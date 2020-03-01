package org.acm.fowler;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        if (daysRented >=1){
        _daysRented = daysRented;
        }
        else{
            System.out.println("Error, Please enter a value greater or equal to 1");
        }
    }

    public int getDaysRented() {
        return _daysRented;
    }
    

    public Movie getMovie() {
        return _movie;  
    
    }
}
