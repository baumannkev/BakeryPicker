/**
 * 
 */

package ca.bcit.comp1510.midterm;

/** Helps with calculations of the Bakery.
 * @author Kevin Baumann
 * @version 1.0
 */
public class BakeryPicker {
   
    
    /** Holds the customers choice of product in String type.
     *
     */
    private static String customerChoice;
    
    /**
     * choice for donut.
     */
    private static String donut = ("donut");
    
    /**
     * choice for cake.
     */
    private static String cake = ("cake");
    
    /**
     * choice for bread.
     */
    private static String bread = ("bread");

    
    /**
     *  Constructor that initializes the instance variables.
     *  @param myProduct is the customers choice.
     */
    public BakeryPicker(String myProduct) {
        customerChoice = myProduct;
        
    }
    
    /** Returns the product specified.
     * @param number of items wanted
     * @return donutChoice for the choice that the customer picked.
     */
    public static double costCalculator(int number) {
        final double costOfDonut = 1.50;
        final double costOfCake = 4.50;
        final double costOfBread = 5.50;
        double total;  
        
        while (number < 0) {
            return 0;
        }
               
        if (donut.equals(customerChoice)) {
            total = costOfDonut * number;
            return (total);
        }
        if (cake.equals(customerChoice)) {
            total = costOfCake * number;
            return (total);
        }
        if (bread.equals(customerChoice)) {
            total = costOfBread * number;
            return (total);
        } else {
            return 0;
        }
        
    }
    

}
