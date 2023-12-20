import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Surgeon extends Doctor implements Inspectionable{
    public Surgeon(String name, LocalDate birthdate, String gender, double seniority, String patient) {
        super(name, birthdate, gender, seniority, patient);
    }

    @NotNull
    @Override
    public String inspection() {
        System.out.printf(" Осмотр врача %s", profession);
        return "Вашему ";
    }
}
