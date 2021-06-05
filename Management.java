public class Management extends Department
{
    public double getTotalSalaryBudget()
    {
        double sum = 0;
        for(int i = 0; i < angajati.size(); i++)
            sum += angajati.get(i).getSalariu()  * 116 / 100;
        return sum;
    }
}
