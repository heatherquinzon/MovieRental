package org.acm.fowler;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;


    public Movie(String title, int priceCode) {
        _title = title;
        if(priceCode >=0 && priceCode <=2){
        _priceCode = priceCode;
        }
        else{
            System.out.println("Error, Not valid pricecode. Please enter 0, 1, or 2");
        }
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int priceCode) {
        if(priceCode >=0 && priceCode <=2){ //testing problem
        _priceCode = priceCode;
        }
        else{
        System.out.println("Error, Not valid pricecode. Please enter 0, 1, or 2");
        }
    }

    public String getTitle() {
        return _title;
    }
   
};
