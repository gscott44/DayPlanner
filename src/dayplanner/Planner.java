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
    
    public void run() {
        
        System.out.println("A)dd Appointment, D)elete Appointment, L)ist Appointment, E)xit");
        UserInput.getChar();
        
        while (UserInput.getChar() != 'E')
            if (UserInput.getChar() == 'A')
                addAppointment();
            else if (UserInput.getChar() == 'D')
                deleteAppointment();
            else if (UserInput.getChar() == 'L')
                listAppointment();
            else
                System.out.println("Please enter a valid choice.");
    }
    
    public boolean compareAppointment(Appointment A1, Appointment A2) {
        
        if (A1 < A2)
            return true;
        else 
            return false;
    }
    
    public void insertAppointment(Appointment A1){
        
    }
    
    public void listAppointment(){
        int number = 1;
        int i = 0;
        
        while (number <= planner.length){
            System.out.println(number + ". " + planner[i]);
            number++;
            i++;
        }
        
    }
    
    public void deleteAppointment(){
        
    }
    
    public void addAppointment(){
        
    }
    
    
}

