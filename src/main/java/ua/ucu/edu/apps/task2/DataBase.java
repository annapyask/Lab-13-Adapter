package ua.ucu.edu.apps.task2;

public class DataBase extends БазаДаних {
    private БазаДаних db;
    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return db.отриматиСтатистичніДані();
    }
}