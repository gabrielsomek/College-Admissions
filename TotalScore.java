
/**
 * This is where to total percent is derived from.
 *
 * @author Gabriel Somek
 * @version March 20, 2019
 */
public class TotalScore extends CollegeAdmissions
{
    public double totalScore(double ACT, double SAT, double APTotal, int numberOfExamsTaken, double GPA, int satPercent, int gpaPercent, int apPercent){
        double total = 0;
        
        double Stands = StandardizeTest(ACT, SAT, satPercent);
        double GPAS = GPA(GPA, gpaPercent); 
        double APExamsT = APExams(APTotal, numberOfExamsTaken, apPercent); 
        
        total = Stands + GPAS + APExamsT;
        
        return total;
    }
}
