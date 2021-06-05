import java.util.Calendar;

public class Education implements Comparable<Education>
{
    public Calendar dataInceput, dataSfarsit;
    public String numeInstitutie, nivel;
    public Double medie;

    public void setDataInceput(Calendar dataInceput)
    {
        this.dataInceput = dataInceput;
    }

    public void setDataSfarsit(Calendar dataSfarsit)
    {
        this.dataSfarsit = dataSfarsit;
    }

    public void setNumeInstitutie(String numeInstitutie)
    {
        this.numeInstitutie = numeInstitutie;
    }

    public void setNivel(String nivel)
    {
        this.nivel = nivel;
    }

    public void setMedie(Double medie)
    {
        this.medie = medie;
    }


    public int compareTo(Education ed)
    {
        return 0;
    }
}
