package cn.zq.threadtest.AQS;

import org.apache.zookeeper.Watcher;
import org.junit.Test;

import java.util.concurrent.locks.Lock;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-10 16:15:42
 */
public class TwinsLockTest {

    public static void main(String []args) {
        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            @Override
            public void run() {
                while(true) {
                    //上锁
                    lock.lock();
                    try {
                        System.out.println(Thread.currentThread().getName());
                    }finally {
                        lock.unlock();
                    }
                }
            }
        }
        for(int i = 0;i < 10;i++) {
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }
    }
}
