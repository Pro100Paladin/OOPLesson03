import java.time.LocalDate;

public abstract class Doctor {
    protected String name;
    protected LocalDate birthdate;
    protected String gender;
    protected String profession;
    protected double seniority;
    protected String patient;

    public Doctor(String name, LocalDate birthdate, String gender, double seniority, String patient){
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.profession = getClass().getSimpleName();
        this.seniority = seniority;
        this.patient = patient;
    }

    public String getName() {return name;}
    public LocalDate getBirthdate() {return birthdate;}
    public String getGender() {return gender;}
    public String getProfession() {return profession;}
    public double getSeniority() {return seniority;}
    public String getPatient() {return patient;}

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                ", profession='" + profession + '\'' +
                ", seniority='" + seniority + '\'' +
                ", patient='" + patient + '\'' +
                '}';
    }

}
