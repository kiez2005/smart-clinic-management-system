@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

```
@Autowired
private TokenService tokenService;

@PostMapping
public ResponseEntity<?> savePrescription(
        @RequestHeader("Authorization") String token,
        @Valid @RequestBody Prescription prescription) {

    if (!tokenService.validateToken(token)) {
        Map<String, Object> error = new HashMap<>();
        error.put("success", false);
        error.put("message", "Invalid token");
        return ResponseEntity.status(401).body(error);
    }

    Map<String, Object> response = new HashMap<>();
    response.put("success", true);
    response.put("message", "Prescription saved successfully");

    return ResponseEntity.ok(response);
}
```

}
