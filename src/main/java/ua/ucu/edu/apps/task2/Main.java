package ua.ucu.edu.apps.task2;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Auth auth = new Auth();
        if (auth.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}