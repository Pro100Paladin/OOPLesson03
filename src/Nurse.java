import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Nurse extends Doctor implements Inspectionable{
    public Nurse(String name, LocalDate birthdate, String gender, double seniority, String patient) {
        super(name, birthdate, gender, seniority, patient);
    }

    @NotNull
    @Override
    public String inspection() {
        System.out.printf("%s ", profession);
        return "Требуется, осмотр ";
    }
}
