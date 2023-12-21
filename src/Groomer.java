import java.time.LocalDate;

public class Groomer extends Doctor implements Inspectionable, СonclusionOperationable{

    public Groomer(String name, LocalDate birthdate, String gender, double seniority, String patient) {
        super(name, birthdate, gender, seniority, patient);
    }

    @Override
    public String inspection(){
        System.out.printf("Осмотр врача %s ", profession);
        String answer = "Ваш питомец в хорошей форме, сейчас мы сделаем ему отличную стрижку!! ";
        return answer;
    }
    public void getHaircut(){
        System.out.println("выполняется стрижка");
    }

    @Override
    public String conclusion(){
        String answer = "Стрижка выполнена!";
        return answer;
    }
}
