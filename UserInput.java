
/**
 * This is where all the points are calculated
 *
 * @author Gabriel Somek
 * @version March 20, 2019
 */
import java.util.Scanner;

public abstract class UserInput implements Requisites

{
    Scanner in = new Scanner (System.in);
    public double StandardizeTest(double ACT, double SAT, double percent){
        double SATpoints = 0;
        double ACTpoints = 0;
        double totalPoints = 0;
        
        double SATpointsX = percent/1600;
        SATpoints = SAT*SATpointsX;
        
        double ACTpointsX = percent/36;
        ACTpoints = ACT*ACTpointsX;
        
        totalPoints = SATpoints + ACTpoints;
        return totalPoints;
    }
    
    public double APExams(double APScore, int numberOfExamsTaken, double percent){
        double points = 0;
        
        int total = 5*numberOfExamsTaken;
        double x = percent/total;
        points = APScore*x;
        
        return points;
    }
    
    public double GPA(double gpa, double percent){ 
        double points = 0;
        double x = percent/4;
        points = gpa*x;
        
        return points;
    }
}
