import java.util.ArrayList;

public class Manager extends Employee
{
    public ArrayList<Recruiter.Request> cereriAngajare = new ArrayList<>();
    double max = 0;
    int k = 0;

    public void process(Job job)
    {
        while(job.nrNecesarCandidati > 0 && cereriAngajare != null)
        {
            //Folosesc un max pentru a gasi cel mai mare rating ai userilor
            max = cereriAngajare.get(k).getScore();

            //compar cu toti ceilalti useri
            for (int i = 0; i < cereriAngajare.size(); i++)
            {
                if (max < cereriAngajare.get(i).getScore())
                {
                    max = cereriAngajare.get(i).getScore();
                    k = i;
                }
            }
            //Trebuie angajat -- aici doar ii dau remove
            cereriAngajare.remove(k);
            k = 0;
            job.nrNecesarCandidati--;
        }
        //setez flagul in false pentru a arata ca nu mai exista cerere pentru job
        if(job.nrNecesarCandidati == 0)
            job.setFlag(false);

    }
}
