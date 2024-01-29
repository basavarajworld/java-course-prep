import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam",
            "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog",
            "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt",
            "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon",
            "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout",
            "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra" };

    public static int chances = 6;
    public static int wordl;
    public static String word;
    public static char[] placeholder;

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int wordind = rd.nextInt(words.length);
        word = words[wordind];
        wordl = word.length();
        placeholder = new char[wordl];
        char g;
        System.out.println(word);
        for (int i = 0; i < wordl; i++) { // initialise the placeholder
            placeholder[i] = '_';
        }

        while (chances > 0) {
            if (guessed()) {
                break;
            }
            printGame();
            System.out.println("Guess the character:");
            g = sc.next().charAt(0);

            if (checkGuess(g)) {
                System.out.println("Correct Guess !!");
            } else {
                System.out.println("Wrong Guess !!");
                chances--;
            }
            System.out.println("-------------------------------------------------------------------------");
        }
        if (chances == 0) {
            System.out.println("you lost!!");
        } else {
            System.out.println("you guessed it");
        }
        sc.close();
    }

    public static boolean checkGuess(char g) {
        for (int i = 0; i < wordl; i++) {
            if (placeholder[i] == '_' && word.charAt(i) == g) {
                placeholder[i] = g;
                return true;
            }
        }
        return false;
    }

    public static void printGame() {
        for (int i = 0; i < wordl; i++) {
            System.out.print(placeholder[i] + " ");
        }
        System.out.println();
        System.out.println("Number of available chances:");
        System.out.println(chances);

    }

    public static boolean guessed() {
        for (int i = 0; i < wordl; i++) {
            if (placeholder[i] == '_') {
                return false;
            }
        }
        return true;
    }
}
