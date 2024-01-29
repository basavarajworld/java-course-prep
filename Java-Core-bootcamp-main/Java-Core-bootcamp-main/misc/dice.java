public class dice {
    public static void main(String[] args) {
        int roll1 = rolldice();
        int roll2 = rolldice();
        int roll3 = rolldice();

        System.out.println("roll1 :" + roll1);
        System.out.println("roll2 :" + roll2);
        System.out.println("roll3 :" + roll3);
    }

    public static int rolldice() {
        double randomN = Math.random() * 6;
        randomN += 1;
        return (int) randomN;
    }

}
