public class Marketing extends Department
{
    public double getTotalSalaryBudget()
    {
        double sum = 0;
        for(int i = 0; i < angajati.size(); i++)
        {
            if(angajati.get(i).getSalariu() > 5000)
                sum += angajati.get(i).getSalariu() * 110 / 100;
            else if(angajati.get(i).getSalariu() < 5000 && angajati.get(i).getSalariu() > 3000)
                sum += angajati.get(i).getSalariu() * 116 / 100;
            else
                sum += angajati.get(i).getSalariu();
        }
        return sum;
    }
}
