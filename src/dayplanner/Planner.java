/* 
 * Programmer: Griffin Scott
 * March 8, 2016
 * CS 182 Lab Project 1
 * 
 */
package dayplanner;

public class Planner {
    
    private Appointment[] planner = new Appointment[20];
    private String[] months = new String[12];
    int numAppointments;
    
    
    public Planner () {
        Appointment a = new Appointment(4, 17, 30, "Mar", "Quiz1");
        Appointment a2 = new Appointment(1, 17, 30, "Apr", "Midterm");
        Appointment a3 = new Appointment(6, 17, 30, "May", "Quiz 2");
        Appointment a4 = new Appointment(3, 17, 30, "Jun", "Final");
        
        planner[0] = a;
        planner[1] = a2;
        planner[2] = a3;
        planner[3] = a4;
        
        
        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        months[3] = "Apr";
        months[4] = "May";
        months[5] = "Jun";
        months[6] = "Jul";
        months[7] = "Aug";
        months[8] = "Sep";
        months[9] = "Oct";
        months[10] = "Nov";
        months[11] = "Dec"; 
        
        numAppointments = 4; 
    }
    
    public void run() {
        
        
         boolean exitMenu = false;
        
        do {
            System.out.println("A)dd Appointment, D)elete Appointment, L)ist Appointment, E)xit");

        char value = UserInput.getChar();
            value = Character.toUpperCase(value);
            
            switch (value) {
                case 'A':
                    addAppointment();
                    break;
                case 'D':
                    deleteAppointment();
                    break;
                case 'L':
                    listAppointment();
                    break;
                case 'E':
                    exitMenu = true;
                    break;
                default:
                    
            }
        } while (!exitMenu);
    }
    
    public boolean compareAppointment(Appointment A1, Appointment A2) {
        
        String a1Month = A1.getMonth();
        String a2Month = A2.getMonth();
        int a1Value = 0;
        int a2Value = 0;
        
        if (A1.getMonth() != A2.getMonth()){
            for (int i = 0; i < months.length; i++){
                if (a1Month == months[i])
                    a1Value = i;
            }
            for (int i = 0; i < months.length; i++){
                if (a2Month == months[i])
                    a2Value = i;
            }
            if (a1Value < a2Value)
                return true;
            else 
                return false;
        }
        else if (A1.getDay() != A2.getDay()){
            if (A1.getDay() < A2.getDay())
                return true;
            else
                return false;
        }
        else if (A1.getHour() != A2.getHour()) {
            if (A1.getHour() < A2.getHour())
                return true;
            else 
                return false; 
        }
        else if (A1.getMinute() != A2.getMinute()){
            if (A1.getMinute() < A2.getMinute())
                return true;
            else 
                return false; 
        }
        else 
            System.out.println("Appointments are identical.");
            return true;
    }
    
    public void insertAppointment(Appointment A1){
        int index = 0;        
        
        for (int i = 0; i < numAppointments; i++){
            if (compareAppointment(A1, planner[i]))
                index = i - 1;
        }
        numAppointments++;
        Appointment temp1 = planner[index];
        planner[index] = A1;
        for (int i = index; i < numAppointments; i++){
            Appointment temp = planner[i+1];
            planner[i+1] = temp1;
            temp1 = temp;
         
    }
        
}
    
    public void listAppointment(){
        int number = 1;
        
        for(int i = 0; i < numAppointments; i++) {
            System.out.println(number + ". " + planner[i].toString());
            number++;
        }
        
    }
    
    public void deleteAppointment(){
        listAppointment();
        System.out.println("Please select an appointment to delete.");
        int value = UserInput.getInt();
        
        numAppointments--;       
        for (int i = value - 1; i < numAppointments; i++){
            if (i + 1 <= numAppointments)
                planner[i] = planner[i + 1];
        }  
    }
    
    public void addAppointment(){
        Appointment A1 = new Appointment();
        A1.inputAppointment();
        insertAppointment(A1);
    }
    
    public static void main(String args[]) {
        Planner p1 = new Planner();
        p1.run();
    }
    
}

