/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayplanner;

import java.util.Scanner;


public class NewClass {
    
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
        System.out.print("Integer input: ");
        return scanner.next().charAt(0);

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
    
