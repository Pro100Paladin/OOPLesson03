import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Oncologist extends Doctor implements Inspectionable{
    public Oncologist(String name, LocalDate birthdate, String gender, double seniority, String patient) {
        super(name, birthdate, gender, seniority, patient);
    }

    @NotNull
    @Override
    public String inspection() {
        System.out.printf("%s Осмотр врача", profession);
        return "Ваш питомец в хорошей форме, сейчас мы сделаем ему отличную стрижку!!";
    }
}
