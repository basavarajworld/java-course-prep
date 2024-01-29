package Thread_inheritance;

public class Main {
    public static void main(String[] args) {
        AthleteThread athlete1 = new AthleteThread(220);
        AthleteThread athlete2 = new AthleteThread(121);

        athlete1.start();
        athlete2.start();

    }
}