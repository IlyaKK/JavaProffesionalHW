package homework2;

public class Main {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                alphabet.printA();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                alphabet.printB();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                alphabet.printC();
            }
        }).start();
    }
}
