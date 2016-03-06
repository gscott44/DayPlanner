/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayplanner;


public class Appointment {
    private String month, message;
    private int day, hour, minute;
    
    public Appointment(){
            day = 1;
            hour = 1;
            minute = 1;
            month = "Jan";
            message = "Default";
        }
        public Appointment (int day, int hour, int minute, String month, String message){
            
        }
        
        public String getMonth(){
            return NewClass.getString();
        }
        
        public void setMonth(int min, int max, String s){
            if (s.length() >= min && s.length() <= max)
                month = s; 
        }
        
        public String getMessage(){
            return NewClass.getString(0, 45);
        }
        
        public void setMessage(int min, int max, String s) {
            if (s.length() >= min && s.length() <= max)
                message = s;             
        }
        
        public int getDay(){
            return NewClass.getInt();
        }
        public void setDay(int x){
            if (x >= 1 && x <= 31) 
		day = x; 
            else 
		System.out.println("Invalid day value.");
        }
        
        public int getHour(){
            return NewClass.getInt();
        }
        
        public void setHour(int x){
            if (x >= 1 && x <= 24)
                hour = x;
            else 
                System.out.println("Invalid hour value.");
        }
        
        public int getMinute(){
            return NewClass.getInt();
        }
        
        public void setMinute(int x){
            if (x >= 0 && x <= 60)
                minute = x; 
            
            else 
                System.out.println("Invalid minute value.");
        }
        public void toString(String month, String message, int day, int hour, int minute){
            System.out.println("Your appointment for " + message + " is on " + month + " " + day + " at " + hour + ":" + minute);
        }
    }


