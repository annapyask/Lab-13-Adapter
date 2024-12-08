package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class FacebookUser {
    private String email;
    private String country;
    private LocalDateTime activeTime;

    public String getEmail() {
        return email;
    }
    
    public String getUserCountry() {
        return country;
    }

    public LocalDateTime getUserActiveTime() {
        return activeTime;
    }

    public String toString() {
        return "FacebookUser(email=" + email + ", country=" + country +")";
    }
}