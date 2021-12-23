package pp;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);

        MyThread first = new MyThread(lock, "ping");
        MyThread second = new MyThread(lock, "pong");

        first.start();
        second.start();
    }

}
