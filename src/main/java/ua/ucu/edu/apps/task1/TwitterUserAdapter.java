package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

public class TwitterUserAdapter implements User{
    private TwitterUser twitterUser;
    
    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }
    
    public String getMail() {
        return twitterUser.getUserMail();
    }
    
    public String getCountry() {
        return twitterUser.getCountry();
    }
    
    public LocalDateTime getActiveTime() {
        return twitterUser.getActiveTime();
    }

    @Override
    public String toString() {
        return twitterUser.toString();
    }
}