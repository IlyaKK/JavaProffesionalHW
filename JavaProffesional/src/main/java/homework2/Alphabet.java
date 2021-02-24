package homework2;

public class Alphabet {
    private final Object mon = new Object();
    private int j = 0;
    private final char[] chars = {'A', 'B', 'C'};

    public void printLetter(char currentLetter) {
        synchronized (mon) {
            try {
                if (j == 3) {
                    j = 0;
                    mon.notifyAll();
                } else if (currentLetter != chars[j]) {
                    mon.wait();
                }
                System.out.print(chars[j]);
                j++;
                mon.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
