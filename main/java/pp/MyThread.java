package pp;

import java.util.concurrent.locks.Lock;

public class MyThread extends Thread {

    private final String message;
    private final Lock lock;

    public MyThread(Lock lock, String message) {
        this.lock = lock;
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(message);
            lock.unlock();
        }
    }
}
