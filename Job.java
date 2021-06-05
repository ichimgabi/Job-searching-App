import java.util.ArrayList;

public class Job
{
    public String numeJob, numeCompanie;
    public boolean flag = true;
    public Constraint constangeri = new Constraint();
    public ArrayList candidati = new ArrayList<>();
    public int nrNecesarCandidati;
    public double salariu;

    public void setNumeJob(String numeJob)
    {
        this.numeJob = numeJob;
    }

    public void setNumeCompanie(String numeCompanie)
    {
        this.numeCompanie = numeCompanie;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public void setSalariu(Double salariu)
    {
        this.salariu = salariu;
    }

    public void apply(User use)
    {

    }

    /*Am verificat constrangerile folosind clasa Calendar pentru extragerea anului si lunii*/
    public boolean meetsRequirements(User user)
    {
        if(user.resume.aniExp() > constangeri.minAnExp && user.resume.aniExp() < constangeri.maxAnExp)
            if(user.resume.educatie.get(0).dataSfarsit.YEAR > constangeri.minAnAbs &&
                user.resume.educatie.get(0).dataSfarsit.YEAR < constangeri.maxAnAbs)
                if(user.resume.educatie.get(0).medie > constangeri.minMedAcad &&
                    user.resume.educatie.get(0).medie < constangeri.maxMedAcad)
                    return true;
        return false;
    }
}
