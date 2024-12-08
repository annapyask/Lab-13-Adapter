package ua.ucu.edu.apps.task1;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;

        User user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("facebook.mail", "Ukraine", LocalDateTime.now());
                user = new FacebookUserAdapter(facebookUser);
                break;

            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("twitter.mail", "Ukraine", LocalDateTime.now());
                user = new TwitterUserAdapter(twitterUser);
                break;
                
            default:
                break;

        }

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello, World!");
    }

}