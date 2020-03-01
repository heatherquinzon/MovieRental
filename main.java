package org.acm.fowler;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Customer customer = new Customer("Aaron");
        
        Movie movie = new Movie("Lion King", 2); //check if we really need set price code.
        Movie movie2 = new Movie("Joker",1);
        
        Rental rental = new Rental(movie, 7);
        Rental rental2 = new Rental(movie2, 2);
        
        customer.addRental(rental);
        customer.addRental(rental2);
        
        /** Testing **/
        System.out.println("Test 1:");
        movie.setPriceCode(4); 
        System.out.println("\nTest 2:");
        System.out.println(rental.getMovie().getTitle());
        System.out.println("\nTest 3:");
        System.out.println(customer.getStatement());
    }
}
