package ua.ucu.edu.apps.task2;

public class Auth extends Авторизація {
    private Авторизація auth;
    public boolean authorize(DataBase db) {
        auth.авторизуватися(db);
        return true;
    }
}