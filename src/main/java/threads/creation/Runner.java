package threads.creation;

import java.util.concurrent.TimeUnit;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Main thread starts...");

//        new FirstTask();
//        new FirstTask();

//        new SecondTask().start();
//        Thread thread = new SecondTask();
//        thread.start();

//        Runnable thirdTask = new ThirdTask();
//        thirdTask.run();
//        new Thread(new ThirdTask()).start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("x");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).run();

        System.out.println("Main thread ends...");
    }

    private static class FirstTask extends Thread {

        private static int count = 0;
        private int id;

        public FirstTask() {
            this.id = ++count;
            this.start();
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(id + ": " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SecondTask extends Thread {
        private static int count = 0;
        private int id;

        public SecondTask() {
            this.id = ++count;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(id + ": " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class ThirdTask implements Runnable {

        private static int count = 0;
        private int id;

        public ThirdTask() {
            this.id = ++count;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(id + ": " + i);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


