package synchronizedKeyword;

public class Main {

    private int count = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.doWork();
    }

    private synchronized void inrementCount() {
        count++;
    }

    public void doWork() {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                inrementCount();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                inrementCount();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);

    }
}
