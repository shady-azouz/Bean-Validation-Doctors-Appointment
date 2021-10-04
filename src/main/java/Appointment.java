import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.Optional;

public class Appointment {
    @Size(min = 10, max = 100, message
            = "Patient's Name must be between 10 and 100 characters")
    private String patientName;

    @Min(value = 0, message = "Age should not be less than 0")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 10, max = 100, message
            = "Doctor's Name must be between 10 and 100 characters")
    private String doctorName;

    private LocalDate appointnemtDate;

    public Optional<@Past LocalDate> getAppointmentDate() {
        return Optional.of(appointnemtDate);
    }
}
