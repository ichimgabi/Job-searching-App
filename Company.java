import java.util.ArrayList;
import java.util.Random;

public class Company
{
    public String nume;
    public Manager manager;
    public ArrayList<Department> departments = new ArrayList<>();
    public ArrayList<Recruiter> recruiters = new ArrayList<>();

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public void setManager(Manager manager)
    {
        this.manager = manager;
    }

    public void add(Department department)
    {
        departments.add(department);
    }

    public void add(Recruiter recruiter)
    {
        recruiters.add(recruiter);
    }

    public void add(Employee employee, Department department)
    {
        for(Department dep : departments)
            if(dep.equals(department))
                dep.add(employee);
    }

    public void remove(Employee employee)
    {
        for(Department dep : departments)
            dep.remove(employee);
    }

    public void remove(Department department)
    {
        for(int i = 0; i < departments.size(); i++)
            if(departments.get(i).equals(department))
                departments.remove(i);
    }

    public void remove(Recruiter recruiter)
    {
        for(Recruiter rec : recruiters)
            if(rec.equals(recruiter))
                recruiter.remove(recruiter);
    }

    /*Pentru a adauga departamentul sursa trebuie sa adaug fiecare job si fiecare angajat in
    departamentul destinatie. Dupa terminare sterg departamentul sursa.*/
    public void move(Department source, Department destination)
    {
        for(int i = 0; i < source.joburi.size(); i++)
            destination.add(source.joburi.get(i));

        for(int i = 0; i < source.angajati.size(); i++)
            destination.add(source.angajati.get(i));

        for(int i = 0; i < departments.size(); i++)
            if(departments.get(i).equals(source))
                departments.remove(i);
    }

    /*Caut in angajatii fiecarui departament angajatul pe care vreau sa il mut, dupa care fac
    mutarea si il sterg din departamentul sursa.*/
    public void move(Employee employee, Department newDepartment)
    {
        for(int i = 0; i < departments.size(); i++)
            for(int j = 0; j < departments.get(i).angajati.size(); j++)
            {
                if(departments.get(i).angajati.get(j).equals(employee))
                {
                    newDepartment.angajati.add(employee);
                    departments.get(i).angajati.remove(j);
                }
            }
    }

    public boolean contains(Department department)
    {
        for(Department dep : departments)
            if(dep.equals(department))
                return true;
        return false;
    }

    public boolean contains(Employee employee)
    {
        for(Department dep : departments)
            if(dep.angajati.contains(employee))
                return true;
        return false;
    }

    public boolean contains(Recruiter recruiter)
    {
        for(Recruiter rec : recruiters)
            if(rec.equals(recruiter))
                return true;
        return false;
    }

    /*Am folosit clasa "Random" pentru a atribui la intamplare oricarui recruiter fiecare user*/
    public Recruiter getRecruiter(User user)
    {
        Random rand = new Random();
        int intRand = rand.nextInt(recruiters.size());
        return recruiters.get(intRand);
    }

    public ArrayList<Job> getJobs()
    {
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < departments.size(); i++)
            for(int j = 0; j < departments.get(i).joburi.size(); j++)
            {
                jobs.add(departments.get(i).joburi.get(j));
            }
        return jobs;
    }
}
