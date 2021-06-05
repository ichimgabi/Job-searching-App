import java.util.ArrayList;
import java.util.Calendar;

abstract class Consumer
{
    public ArrayList<Consumer> cunoscuti = new ArrayList<>();
    public Resume resume;


    public void add(Education education)
    {
        resume.educatie.add(education);
    }

    public void add(Experience experience)
    {
        resume.experienta.add(experience);
    }

    public void add(Consumer consumer)
    {
        this.add(consumer);
    }

    public int getDegreeInFriendship(Consumer consumer)
    {
        return 0;

    }

    public void remove(Consumer consumer)
    {
        for(Consumer cunosc : cunoscuti)
            if(cunosc.equals(consumer))
                remove(cunosc);
    }

    public int getGraduationYear()
    {
        return resume.educatie.get(0).dataSfarsit.YEAR;
    }

    public Double meanGPA()
    {
        return resume.educatie.get(0).medie;
    }

    class Resume
    {
        public Information date = new Information();
        public ArrayList<Education> educatie = new ArrayList();
        public ArrayList<Experience> experienta = new ArrayList();

        /*Am calculat anii de experienta prin folosirea clasei Calendar pentru a extrage
        anul si luna fiecarei date*/
        public int aniExp()
        {
            int ani = 0;
            for(int i = 0; i < experienta.size(); i++)
            {

                if(experienta.get(i).dataSfarsit.get(Calendar.YEAR) -
                        experienta.get(i).dataStart.get(Calendar.YEAR) < 1 &&
                        experienta.get(i).dataSfarsit.get(Calendar.MONTH) -
                                experienta.get(i).dataStart.get(Calendar.MONTH) < 3)
                    ani++;
                else
                    ani += experienta.get(i).dataSfarsit.get(Calendar.YEAR) -
                            experienta.get(i).dataStart.get(Calendar.YEAR);
            }
            return ani;
        }
    }
}
