@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;

    private String email;

    private String speciality;

    @ElementCollection
    private List<String> availableTimes;

    // getters, setters
}
