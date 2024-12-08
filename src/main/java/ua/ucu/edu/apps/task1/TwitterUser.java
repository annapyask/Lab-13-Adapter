package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class TwitterUser {
    private String email;
    private String country;
    private LocalDateTime activeTime;

    public String getUserMail() {
        return email;
    }
    
    public String getCountry() {
        return country;
    }

    public LocalDateTime getActiveTime() {
        return activeTime;
    }
}