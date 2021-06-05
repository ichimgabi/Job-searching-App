import java.util.ArrayList;

public class Application
{
    public ArrayList<Company> companii = new ArrayList<>();
    public ArrayList<User> utilizatori = new ArrayList<>();

    public ArrayList<Company> getCompanies()
    {
        return companii;
    }

    public Company getCompany(String name)
    {
        for(Company comp : companii)
            if(comp.nume.equals(name))
                return comp;
        return null;
    }

    public void add(Company company)
    {
        companii.add(company);
    }

    public void add(User user)
    {
        utilizatori.add(user);
    }

    public boolean remove(Company company)
    {
        return companii.remove(company);
    }

    public boolean remove(User user)
    {
        return utilizatori.remove(user);
    }

    /*Fac trecerea prin joburile fiecarui departament ale fiecarei companii (3 for-uri)
     dupa care le adaug in lista*/
    public ArrayList<Job> getJobs(ArrayList<String> companies)
    {
        ArrayList<Job> joburi = new ArrayList<>();
        for(int i = 0; i < companies.size(); i++)
            for(int j = 0; j < companii.size(); j++)
            {
                if (companies.get(i).equals(companii.get(j).nume))
                {
                    for (int k = 0; k < companii.get(j).departments.size(); k++)
                        for (int l = 0; l < companii.get(j).departments.get(k).joburi.size(); l++)
                            joburi.add(companii.get(j).departments.get(k).joburi.get(l));
                }
            }

        return joburi;
    }
}
