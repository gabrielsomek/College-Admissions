
/**
 * Initializes variables.
 *
 * @author Gabriel Somek
 * @version March 20, 2019
 */
public class Percentages extends CollegeAdmissions
{
    public String area;
    public int percent;
    public Percentages(String area, int percent){
        this.area = area;
        this.percent = percent;
    }
    
    public int getPercent(String area){
        return percent;
    }
}
