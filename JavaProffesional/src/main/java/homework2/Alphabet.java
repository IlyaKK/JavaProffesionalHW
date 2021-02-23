package homework2;

public class Alphabet {
    private char aChar = 'C';

    public synchronized void printA() {
        if (aChar != 'A') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        aChar = 'B';
        System.out.print(aChar);
        notify();
    }

    public synchronized void printB() {
        if (aChar != 'B') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        aChar = 'C';
        System.out.print(aChar);
        notify();
    }

    public synchronized void printC() {
        if (aChar != 'C') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        aChar = 'A';
        System.out.print(aChar);
        notify();
    }
}
