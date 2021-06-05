import java.util.ArrayList;
import java.util.Calendar;

public class Information
{
    private String nume, prenume;
    private String email, telefon, sex;
    private Calendar dataNastere;
    private ArrayList<String> limbiCunoscute = new ArrayList<>();

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public void setPrenume(String prenume)
    {
        this.prenume = prenume;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public void setDataNastere(Calendar dataNastere)
    {
        this.dataNastere = dataNastere;
    }

    public void add(String limbiCunoscute)
    {
        this.limbiCunoscute.add(limbiCunoscute);
    }
}
