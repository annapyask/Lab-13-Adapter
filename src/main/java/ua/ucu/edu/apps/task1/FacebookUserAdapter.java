package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

public class FacebookUserAdapter implements User{
    private FacebookUser facebookUser;
    
    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }
    
    public String getMail() {
        return facebookUser.getEmail();
    }
    
    public String getCountry() {
        return facebookUser.getUserCountry();
    }
    
    public LocalDateTime getActiveTime() {
        return facebookUser.getUserActiveTime();
    }

    @Override
    public String toString() {
        return facebookUser.toString();
    }
}