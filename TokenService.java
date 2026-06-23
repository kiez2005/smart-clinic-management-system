@Service
public class TokenService {

```
private final String SECRET =
        "mySecretKeyForSmartClinicManagementSystem12345";

public String generateToken(String email) {
    return Jwts.builder()
            .setSubject(email)
            .setIssuedAt(new Date())
            .signWith(getSigningKey())
            .compact();
}

private Key getSigningKey() {
    return Keys.hmacShaKeyFor(
            SECRET.getBytes(StandardCharsets.UTF_8));
}

public boolean validateToken(String token) {
    return token != null && !token.isEmpty();
}
```

}
