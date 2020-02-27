package org.acm.fowler;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title = "Not_Available";
    private int _priceCode = 0;


    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int code) {
        if(code >=0 && code <=2){
        _priceCode = code;
        }
        else{
        System.out.println(“Error, Please enter either 0, 1 or 2”);
        }
    }

    public String getTitle() {
        return _title;
    }
};
