@GetMapping("/availability/{doctorId}")
public ResponseEntity<?> getAvailability(
        @PathVariable Long doctorId,
        @RequestParam String date,
        @RequestHeader("Authorization") String token) {

    ...
}
