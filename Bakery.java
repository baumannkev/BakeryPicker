/**
 * 
 */

package ca.bcit.comp1510.midterm;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
/** Bakery program that helps customer pick a product they like. And enters 
 * them in a draw .
 * @author Kevin Baumann
 * @version 1.0
 *
 */

public class Bakery {

    /** Driver class.
     * @param args drives the program.
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.###");
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String myName = scan.next();
       
        System.out.println("***********************************************"
                + "\n******************"
                + "KEVIN'S BAKERY***************"
                + "\n***********************************************");
        
        System.out.println("\nWelcome to Kevin's Bakery " + myName 
                 + "\nPlease type a product from this list of items"
                        + ":\ndonut " + "\ncake " + "\nbread");
        String myProduct = scan.next();
        BakeryPicker myChoice = new BakeryPicker(myProduct);
        
        
        System.out.println("Great! Now pick the amount of " + myProduct 
                + " that you want: ");
        int myNumber = scan.nextInt();
        String myTotal = df.format(BakeryPicker.costCalculator(myNumber));
        
        System.out.println("Your total for " + myNumber + " items of " 
                + myProduct + " : $" + myTotal);
        
        System.out.println("\nEnter a number between 0-10 to join a draw for "
                + "today!: ");
        int myLuckyNumber = scan.nextInt();
        String luckyNumber =  draw(myLuckyNumber);
        
        System.out.println(luckyNumber  
                + "\nThank you for visiting us today!\nPlease leave a review "
                + "below of your experience: ");
        String experience = scan.nextLine();
        
        System.out.println("Thank you for typing in your experience, I will be"
                + " sure to pass this on: " + experience);
        
        System.out.println("\n" + myChoice);
        scan.close();
    }
    
    /** Lucky number generator.
     * 
     * @param luck number.
     * @return if it got the lucky number.
     */
    public static String draw(int luck) {
        String winner = ("You are a winner!");
        String loser = ("Better luck next time!");
        final int range = 10;
        
        
        Random generator = new Random();
        int result = generator.nextInt(range);
        if (result == luck) {   
            return winner;
        } else {
            return loser;
        }
        
    }

}
