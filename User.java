import java.util.ArrayList;

public class User extends Consumer
{
    public ArrayList<String> interestingComp = new ArrayList<>();

    public Employee convert()
    {
        Employee nou = new Employee();
        nou.setNumeCompanie(interestingComp.get(0));
        nou.setSalariu(1000);
        return nou;
    }

    public Double getTotalScore()
    {
        return meanGPA() + 1.5 * resume.aniExp();
    }
}
