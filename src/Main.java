import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss");
        Fish flipper = new Fish("Flipper", LocalDate.of(2000, 4, 8), new ArrayList<>(), "-", "Lopaka");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        Duck duck = new Duck("Donald", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Flu", "Walter");
        Penguin penguin = new Penguin("Lolo", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Flu", "Gennady");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, eagle, penguin, duck, new Fish("Pepe", LocalDate.of(1997, 2, 6), new ArrayList<>(), "Flu", "Harry"));
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());

        //Groomer
        String patientBarsik = barsik.getName();
        Groomer groom = new Groomer("Svetlana", LocalDate.of(1995, 6, 7), "woman",3.5, patientBarsik);
        System.out.println(groom);
        System.out.println(groom.inspection());
        groom.getHaircut();
        System.out.println(groom.conclusion());

        //Surgeon
        String patientDuck = duck.getName();
        Surgeon surg = new Surgeon("Oleg", LocalDate.of(1988, 10, 11), "man", 9.3, patientDuck);
        System.out.println(surg);
        System.out.println(surg.inspection());
        surg.getSurgical_operation();
        System.out.println(surg.conclusion());

        //Nurse
        String patientFlipper = flipper.getName();
        Nurse nurse = new Nurse("Anna", LocalDate.of(1997, 9, 9), "woman", 4.9, patientFlipper);
        System.out.println(nurse);
        System.out.println(nurse.inspection());
        nurse.getVattination();
        System.out.println(nurse.conclusion());



//        protected String name;
//    protected LocalDate birthdate;
//    protected String gender;
//    protected String profession;
//    protected double seniority;
//    protected String patient;

    }
}