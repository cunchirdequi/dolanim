import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Example {
    public static void main(String[] args) {
        try {
            // Attempting to encrypt data with an invalid key
            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec key = new SecretKeySpec("invalidKey".getBytes(), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
        } catch (InvalidKeyException e) {
            System.out.println("InvalidKeyException: " + e.getMessage());
            // Handle the exception or provide appropriate feedback to the user
        }
    }
}
