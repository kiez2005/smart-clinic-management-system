@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(
            Long doctorId,
            LocalDate date) {

        return appointmentRepository
                .findByDoctorIdAndDate(doctorId, date);
    }
}
