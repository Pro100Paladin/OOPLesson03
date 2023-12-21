import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class Surgeon extends Doctor implements Inspectionable, СonclusionOperationable{
    public Surgeon(String name, LocalDate birthdate, String gender, double seniority, String patient) {
        super(name, birthdate, gender, seniority, patient);
    }

    @NotNull
    @Override
    public String inspection() {
        System.out.printf(" Осмотр врача %s", profession);
        return "Вашему питомцу требуется, небольшая операция...";
    }

    public void getSurgical_operation(){
        System.out.println("выполняется хирургическая операция");
    }

    @NotNull
    @Override
    public String conclusion() {
        String answer = "Выполнена операция";
        return answer;
    }

}
