class ChildThread extends Thread {
    public void run() {
        for (int i = 101; i <= 110; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(200); // optional, to show interleaving clearly
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        ct.start(); // Starting child thread

        // Parent thread prints 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Parent Thread: " + i);
            try {
                Thread.sleep(200); // optional delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}