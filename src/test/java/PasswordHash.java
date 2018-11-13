import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import junit.framework.TestCase;

public class PasswordHash extends TestCase {

  public void testBCryptHash() {
    final String password = "secret";
    final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    final String hashedPassword = passwordEncoder.encode(password);
    System.out.println(hashedPassword);
  }

  public void testMD5Hash() {
    final String password = "secret";
    final Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
    final String hashedPassword = passwordEncoder.encodePassword(password, null);
    System.out.println(hashedPassword);
  }
}
