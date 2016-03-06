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
            if (hour < 10)
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + " 0" + hour + ":" + minute;
            else 
                date = "Your appointment for " + message + " is on " + month + " " + day + " at " + hour + ":" + minute;
        return date;
        }
        public void inputAppointment(){
            System.out.println("Please enter a month for your appointment.");
            setMonth(3, 3, NewClass.getString(3, 3));
            
            System.out.println("Please enter a day for your appointment.");
            setDay(NewClass.getInt(0, 31));
            
            System.out.println("Please enter a hour for your appointment.");
            setHour(NewClass.getInt(0, 24));
            
            System.out.println("Please enter a minute for your appointment.");
            setMinute(NewClass.getInt(0, 60));
            
            System.out.println("Please enter a message for your appointment.");
            setMessage(0, 40, NewClass.getString(0, 40));
        }


    public static void main(String[] args) {
        Appointment a1 = new Appointment();
        a1.inputAppointment();
        System.out.println(a1.toString());
        
        Appointment a2 = new Appointment(25, 12, 25, "jan", "Hi");
        System.out.println(a2);
    }


}


