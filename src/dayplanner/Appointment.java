/*
 * Programmer: Griffin Scott    
 * March 8, 2016
 * CS 182 Lab project 1
 * This Appointment.java file uses different methods to make appointments. It uses get and set methods for 
 * each aspect of the appointment and then pulls from the UserInput.java file to get user input and make 
 * sure all the inputs are valid for the appointment.  
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
            setDay(day);
            setHour(hour);
            setMinute(minute);
            setMonth(3, 3, month); 
            setMessage(0, 40, message);
        }
        
        public String getMonth(){
            return month;
        }
        
        public void setMonth(int min, int max, String s){
            if (s.length() >= min && s.length() <= max)
                month = s; 
        }
        
        public String getMessage(){
            return message;
        }
        
        public void setMessage(int min, int max, String s) {
            if (s.length() >= min && s.length() <= max)
                message = s;             
        }
        
        public int getDay(){
            return day;
        }
        public void setDay(int x){
            if (x >= 1 && x <= 31) 
		day = x; 
            else 
		System.out.println("Invalid day value.");
        }
        
        public int getHour(){
            return hour;
        }
        
        public void setHour(int x){
            if (x >= 1 && x <= 24)
                hour = x;
            else 
                System.out.println("Invalid hour value.");
        }
        
        public int getMinute(){
            return minute;
        }
        
        public void setMinute(int x){
            if (x >= 0 && x <= 60)
                minute = x; 
            
            else 
                System.out.println("Invalid minute value.");
        }
       
        public String toString(){
            String date;
            if (hour < 10 && minute < 10)
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + " 0" + hour + ":" + "0" + minute;
            else if (minute < 10)
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + hour + ":" + "0" + minute;
            else if (hour > 10 && minute < 10)
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + hour + ":" + "0" + minute;
            else if (hour < 10 && minute > 10)
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + "0"+ hour + ":" + minute;
            else
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + hour + ":" + minute;
        return date;
        }
        public void inputAppointment(){
            System.out.println("Please enter a month for your appointment.");
            setMonth(3, 3, UserInput.getString(3, 3));
            
            System.out.println("Please enter a day for your appointment.");
            setDay(UserInput.getInt(1, 31));
            
            System.out.println("Please enter a hour for your appointment.");
            setHour(UserInput.getInt(0, 24));
            
            System.out.println("Please enter a minute for your appointment.");
            setMinute(UserInput.getInt(0, 59));
            
            System.out.println("Please enter a message for your appointment.");
            setMessage(0, 40, UserInput.getString(0, 40));
        }


    public static void main(String[] args) {
        Appointment a1 = new Appointment();
        a1.inputAppointment();
        System.out.println(a1.toString());
        
        Appointment a2 = new Appointment(1, 1, 1, "Jan", "Hello World!");
        System.out.println(a2);
    }


}


