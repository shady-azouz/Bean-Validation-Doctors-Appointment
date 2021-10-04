import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Appointment appointment = new Appointment(
                "Shady",
                -3,
                "20 Bayoumy Nassar Street",
                "shady.azouz@gmail.com",
                "Karim",
                LocalDate.of(2021,12,10)
        );

        Set<ConstraintViolation<Appointment>> violations = validator.validate(appointment);
        for (ConstraintViolation<Appointment> violation : violations) {
            System.out.println("error: "+violation.getMessage());
        }
    }
}
