package se.klartext.security.util;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public final class TokenGenerator {

    private TokenGenerator(){}

    private static final TokenGenerator INSTANCE = new TokenGenerator();

    public static TokenGenerator getInstance(){
        return INSTANCE;
    }

    public Optional<String> generateToken(String secret) {

        String timestamp = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        String concat = secret + timestamp;
        MessageDigest digest = null;

        try {
            digest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Failed generating token hash: " + e.getMessage());
            return Optional.empty();
        }

        byte[] hash = digest.digest(concat.getBytes(Charset.forName("UTF-8")));
        String token = new String(Base64.encodeBase64URLSafeString(hash));
        return Optional.of(token);
    }
}
