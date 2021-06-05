public class Finance extends Department
{
    public double getTotalSalaryBudget()
    {
        double sum = 0;
        for(int i = 0; i < angajati.size(); i++)
        {
            if(angajati.get(i).resume.aniExp() < 1)
                sum += angajati.get(i).salariu * 110 / 100;
            else
                sum += angajati.get(i).salariu * 116 / 100;
        }
        return sum;
    }
}
