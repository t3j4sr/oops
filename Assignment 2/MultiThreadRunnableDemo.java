class ChildTask implements Runnable {
    @Override
    public void run() {
        for (int i = 101; i <= 110; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(200);  // Optional delay for clarity
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadRunnableDemo {
    public static void main(String[] args) {
        ChildTask ct = new ChildTask();
        Thread childThread = new Thread(ct);
        childThread.start(); // Start child thread

        // Parent thread task (main thread)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Parent Thread: " + i);
            try {
                Thread.sleep(200); // Optional delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}