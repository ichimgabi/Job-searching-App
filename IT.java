import java.util.ArrayList;

public class IT extends Department
{
    public double getTotalSalaryBudget()
    {
        double sum = 0;
        for(int i = 0; i < angajati.size(); i++)
            sum += angajati.get(i).getSalariu();
        return sum;
    }
}
