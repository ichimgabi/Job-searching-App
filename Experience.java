import java.util.Calendar;

public class Experience implements Comparable<Experience>
{
    public Calendar dataStart, dataSfarsit;
    public String pozitie, companie;

    public void setDataInceput(Calendar dataStart)
    {
        this.dataStart = dataStart;
    }

    public void setDataSfarsit(Calendar dataSfarsit)
    {
        this.dataSfarsit = dataSfarsit;
    }

    public void setPozitie(String pozitie)
    {
        this.pozitie = pozitie;
    }

    public void setCompanie(String companie)
    {
        this.companie = companie;
    }

    public int compareTo(Experience exp)
    {
        return this.dataSfarsit.compareTo(exp.dataSfarsit);
    }
}
