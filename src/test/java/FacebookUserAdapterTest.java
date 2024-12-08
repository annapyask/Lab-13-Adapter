import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import ua.ucu.edu.apps.task1.FacebookUser;
import ua.ucu.edu.apps.task1.FacebookUserAdapter;
import ua.ucu.edu.apps.task1.MessageSender;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacebookUserAdapterTest {
    private FacebookUserAdapter facebookUserAdapter;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        FacebookUser facebookUser = new FacebookUser("test@example.com", "USA", LocalDateTime.now());
        facebookUserAdapter = new FacebookUserAdapter(facebookUser);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testFacebookUserAdapterSend() {
        MessageSender messageSender = new MessageSender();
        messageSender.send(facebookUserAdapter, "Hello, World!");
        String actual = outContent.toString().trim();
        assertEquals("Sending message to FacebookUser(email=test@example.com, country=USA)\n" + //
                        "Message content: Hello, World!", actual);
    }
}
