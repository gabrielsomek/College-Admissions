
/**
 * This is where all the user input is taken and sent to other classes to calculate.
 *
 * @author Gabriel Somek
 * @version March 20, 2019
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
public class CollegeAdmissions extends UserInput
{   
    public int points; 
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        
        ArrayList<Percentages> percentPerSubject = new ArrayList<Percentages>();
        
        System.out.println("Presumptions:\nSAT: 20%\nACT: 20%\nGPA: 50%\nAP Exams: 10%");
        System.out.println("Would you like to change any of this? (Y or N)");
        String change = in.next();
        
        //Automatic percentages
        int satPercent = 20;
        int gpaPercent = 50;
        int apPercent = 10;
        
        //If the user wants to change the percentages
        if(change.equalsIgnoreCase("y")){
            System.out.println("What do you want SAT/ACT percent to be? (Each)");
            satPercent = in.nextInt();
            System.out.println("What do you want GPA percent to be?");
            gpaPercent = in.nextInt();
            System.out.println("What do you want AP percent to be?");
            apPercent = in.nextInt();
        }
        
        percentPerSubject.add(new Percentages("satPercent",satPercent));
        percentPerSubject.add(new Percentages("gpaPercent",gpaPercent));
        percentPerSubject.add(new Percentages("apPercent",apPercent));
       
        //Gathering user info
        System.out.println("What is your SAT score? (Non-superscore)");
        double SAT = in.nextDouble();
        
        System.out.println("What is your ACT score? (Non-superscore)");
        double ACT = in.nextDouble();
        
        System.out.println("How many AP Exams have you taken?");
        int numberOfExamsTaken = in.nextInt();
        
        System.out.println("What is your total ap score (sum of all AP scores)");
        double APTotal = in.nextDouble();
       
        System.out.println("What is your GPA?");
        double GPA = in.nextDouble();
        
        TotalScore person1 = new TotalScore(); // We need this so we can reference it from a static contex
        
        double percent = person1.totalScore(ACT, SAT, APTotal, numberOfExamsTaken, GPA, satPercent, gpaPercent, apPercent);
        
        Math.round(percent);
        
        //Print
        System.out.println("You have a " + (int)percent + "% chance of getting admitted into MIT");
        
    }
    }
    
       
    
    
    
    


