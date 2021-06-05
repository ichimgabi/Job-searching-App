public class Test
{
    public static void main(String[] args)
    {
        Application app = new Application();

        //Comapnii
        Company comp1 = new Company();
        Company comp2 = new Company();

        //Manageri
        Manager man1 = new Manager();
        Manager man2 = new Manager();

        //Departamente
        IT depIT1 = new IT();
        IT depIT2 = new IT();
        Management depMan1 = new Management();
        Management depMan2 = new Management();
        Marketing depMar1 = new Marketing();
        Marketing depMar2 = new Marketing();
        Finance depFin1 = new Finance();
        Finance depFin2 = new Finance();

        //Angajati
        Employee empIT1 = new Employee();
        Employee empMan1 = new Employee();
        Employee empMar1 = new Employee();
        Employee empFin1 = new Employee();
        Employee empMar1_2 = new Employee();
        Employee empIT2 = new Employee();
        Employee empMan2 = new Employee();
        Employee empMar2 = new Employee();
        Employee empFin2 = new Employee();
        Employee empMar2_2 = new Employee();

        //Recruiteri
        Recruiter rec1_1 = new Recruiter();
        Recruiter rec1_2 = new Recruiter();
        Recruiter rec2_1 = new Recruiter();
        Recruiter rec2_2 = new Recruiter();

        //Useri
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        User u4 = new User();

        //Jobs
        Job j1_1 = new Job();
        Job j1_2 = new Job();
        Job j2_1 = new Job();
        Job j2_2 = new Job();


        man1.setNumeCompanie("Amazon");
        man2.setNumeCompanie("Google");

        comp1.setNume("Amazon");
        comp1.departments.add(depFin1);
        comp1.departments.add(depIT1);
        comp1.departments.add(depMan1);
        comp1.departments.add(depMar1);
        comp2.setNume("Google");
        comp2.departments.add(depFin2);
        comp2.departments.add(depIT2);
        comp2.departments.add(depMan2);
        comp2.departments.add(depMar2);

        comp1.add(empIT1, depIT1);
        comp1.add(empMar1, depMar1);
        comp1.add(empMan1, depMan1);
        comp1.add(empFin1, depFin1);
        comp1.add(empMar1_2, depMar1);
        comp2.add(empIT2, depIT2);
        comp2.add(empFin2, depFin2);
        comp2.add(empMar2, depMar2);
        comp2.add(empMan2, depMan2);
        comp2.add(empMar2_2, depMar2);

        comp1.add(rec1_1);
        comp1.add(rec1_2);
        comp2.add(rec2_1);
        comp2.add(rec2_2);

        j2_1.nrNecesarCandidati = 1;
        j2_1.salariu = 10000;
        j2_1.constangeri.minAnAbs = 2002;
        j2_1.constangeri.maxAnAbs = 2020;
        j2_1.constangeri.minAnExp = 2;
        j2_1.constangeri.maxAnExp = 150;
        j2_1.constangeri.minMedAcad = 8;
        j2_1.constangeri.maxMedAcad = 10.1;

        j2_2.nrNecesarCandidati = 1;
        j2_2.salariu = 5000;
        j2_2.constangeri.minAnAbs = 1900;
        j2_2.constangeri.maxAnAbs = 2100;
        j2_2.constangeri.minAnExp = 0;
        j2_2.constangeri.maxAnExp = 2;
        j2_2.constangeri.minMedAcad = 9;
        j2_2.constangeri.maxMedAcad = 10.1;

        j1_1.nrNecesarCandidati = 1;
        j1_1.salariu = 12000;
        j1_1.constangeri.minAnAbs = 2014;
        j1_1.constangeri.maxAnAbs = 2020;
        j1_1.constangeri.minAnExp = 1;
        j1_1.constangeri.maxAnExp = 150;
        j1_1.constangeri.minMedAcad = 9;
        j1_1.constangeri.maxMedAcad = 10.1;

        j1_2.nrNecesarCandidati = 1;
        j1_2.salariu = 6000;
        j1_2.constangeri.minAnAbs = 1900;
        j1_2.constangeri.maxAnAbs = 2100;
        j1_2.constangeri.minAnExp = 0;
        j1_2.constangeri.maxAnExp = 2;
        j1_2.constangeri.minMedAcad = 9.35;
        j1_2.constangeri.maxMedAcad = 10.1;

        app.companii.add(comp1);
        app.companii.add(comp2);
    }
}
