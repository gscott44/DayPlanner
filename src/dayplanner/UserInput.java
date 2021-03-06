/*
 * Programmer: Griffin Scott
 * March 8, 2016
 * CS 182 Lab Project 1
 * This UserInput.java file is going to be used for all the projects we have in this class.  
 * this is used for all user input so we do not have to make new scanners everytime we are gettin 
 * input from the user.  
 */
package dayplanner;

import java.util.Scanner;


public class UserInput {
    
        static Scanner scanner = new Scanner(System.in);

    public static int getInt (){
        System.out.print("Integer input: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getInt(int min, int max){
        boolean userValue = true; 
        int x;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ". ");
            x = getInt();
            if (x >= min && x <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + " " + max + ". "); 
                userValue = false; 
            }
        } while (!userValue); 
        return x;
                 
    }

    public static char getChar(){
        System.out.print("Char input: ");
        return scanner.nextLine().charAt(0);

    }
    
    public static char getChar(char min, char max) {
        min = Character.toUpperCase(min);
        max = Character.toUpperCase(max);
        boolean userValue = true;
        char x;
        do{
            System.out.println("Please enter a character between " + min + " and " + max + ". ");
            x = getChar();
            char temp = x;
            temp = Character.toUpperCase(temp);
            if (temp >= min && temp <= max){
                userValue = true; 
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + max + ". ");
                userValue = false;
            }
        } while (!userValue);
        return x;

    }
    
    public static double getDouble(){
        System.out.print ("Double input: ");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public static double getDouble(double min, double max) {
        boolean userValue = true; 
        double x;
        do {
            System.out.print("Enter an double value between " + min + " and " + max + ". ");
            x = getDouble();
            if (x >= min && x <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + " " + max + ". "); 
                userValue = false; 
            }
        } while (!userValue); 
        return x;
    }
    
    public static String getString(){        
        System.out.println("String: ");
        return scanner.nextLine();
    }

    public static String getString(int min, int max){
        boolean userValue = true; 
        String x;
        do {
            System.out.print("Enter an String between " + min + " and " + max + " characters: ");
            x = getString();
            if (x.length() >= min && x.length() <= max){
                userValue = true;
            }
            else {
                System.out.println ("Error. Input must be between " + min + " and " + " " + max + " characters. "); 
                userValue = false; 
            }
        } while (!userValue); 
        return x;
         
    }
    
  public static void main(String args[]) {
    
      System.out.println(getInt(0, 30));
      
      System.out.println(getChar('a', 'z'));
      
      System.out.println(getDouble(0.0, 30.0));
      
      System.out.println(getString(0, 40));
  }
}
    
