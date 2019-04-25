
/**
 * This is the interface in where all the requirements will be.
 *
 * @author Gabriel Somek
 * @version March 20, 2019
 */
public interface Requisites
{
    public abstract double StandardizeTest(double SAT, double ACT, double percent);
    public abstract double GPA(double gpa, double percent);
    public abstract double APExams(double APScore, int numberOfExamsTaken, double percent);
}
