package FunctionalInterfaces;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable backgroundTask = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing task " + i + " in background...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Background job completed!");
        };
        Thread thread = new Thread(backgroundTask);
        thread.start();

        System.out.println("Main thread continues running...");
    }
}
