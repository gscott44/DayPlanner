/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package dayplanner;

public class Planner {
    
    private Appointment[] planner = new Appointment[20];
    
    public Planner () {
        Appointment a = new Appointment(4, 17, 30, "Mar", "Quiz1");
        Appointment a2 = new Appointment(1, 17, 30, "Apr", "Midterm");
        Appointment a3 = new Appointment(6, 17, 30, "May", "Quiz 2");
        Appointment a4 = new Appointment(3, 17, 30, "Jun", "Final");
        
        Appointment[] planner = {a, a2, a3, a4};
    }
    
    public void runMethod() {
        
        System.out.println("A)dd Appointment, D)elete Appointment, L)ist Appointment, E)xit");
        UserInput.getChar();
                
    }
    
    public boolean compareAppointment(Appointment A1, Appointment A2) {
        
    }
    
    public void insertAppointment(Appointment A1){
        
    }
    
    public void listAppointment(){
        
    }
    
    public void deleteAppointment(){
        
    }
    
    public void addAppointment(){
        
    }
    
    public 
    
}

