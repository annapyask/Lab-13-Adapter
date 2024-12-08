package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

public interface User {
    public String getMail();
    
    public String getCountry();

    public LocalDateTime getActiveTime();
}