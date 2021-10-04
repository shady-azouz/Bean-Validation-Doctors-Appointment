import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Optional;

public class Appointment {
    @Size(min = 10, max = 100, message
            = "Patient's Name must be between 10 and 100 characters")
    private String patientName;

    @Min(value = 0, message = "Age should not be less than 0")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Pattern(regexp="[\\d]+[[\\s][\\w]+]+", message = "address should contain building number and street name")
    private String address;

    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 10, max = 100, message
            = "Doctor's Name must be between 10 and 100 characters")
    private String doctorName;

    private LocalDate appointnemtDate;

    public Optional<@Future LocalDate> getAppointmentDate() {
        return Optional.of(appointnemtDate);
    }

    public Appointment(String patientName, int age, String address, String email, String doctorName, LocalDate appointnemtDate) {
        this.patientName = patientName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.doctorName = doctorName;
        this.appointnemtDate = appointnemtDate;
    }

}
