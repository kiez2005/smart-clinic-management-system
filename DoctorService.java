@Service
public class DoctorService {

    public List<String> getAvailableSlots(
            Long doctorId,
            String date) {

        return Arrays.asList(
                "09:00",
                "10:00",
                "11:00");
    }

    public Map<String, Object> login(
            String email,
            String password) {

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("email", email);

        return response;
    }
}
