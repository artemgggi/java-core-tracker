package ru.job4j.threads;

public class ConsoleLoading implements Runnable {
    Thread thread = new Thread(
            () -> {
            }
    );

    @Override
    public void run() {
        String[] process = new String[] {"/", "|", "\\"};
        for (int i = 0; i < 100; i++) {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(500);
                    System.out.print("\rLoading " + process[i % 4]);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread progress = new Thread(new ConsoleLoading());
        progress.start();
        Thread.sleep(1000);
    }
}
