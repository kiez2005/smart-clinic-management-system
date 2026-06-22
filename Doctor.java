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
    @GetMapping("/availability/{doctorId}")
public ResponseEntity<?> getAvailability(
        @PathVariable Long doctorId,
        @RequestParam String date,
        @RequestHeader("Authorization") String token) {

    if (!tokenService.validateToken(token)) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid token");
    }

    List<String> slots =
            doctorService.getAvailableSlots(doctorId, date);

    return ResponseEntity.ok(slots);
}
