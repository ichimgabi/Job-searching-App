import java.util.ArrayList;

abstract class Department
{
    public ArrayList<Employee> angajati = new ArrayList<>();
    public ArrayList<Job> joburi = new ArrayList<>();

    public abstract double getTotalSalaryBudget();

    public ArrayList<Job> getJobs()
    {
        return joburi;
    }

    public void add(Employee employee)
    {
        angajati.add(employee);
    }

    public void remove(Employee employee)
    {
        angajati.remove(employee);
    }

    public void add(Job job)
    {
        joburi.add(job);
    }

    public ArrayList<Employee> getEmployees()
    {
        return angajati;
    }
}
