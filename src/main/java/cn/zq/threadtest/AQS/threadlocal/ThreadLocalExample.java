package cn.zq.threadtest.AQS.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * description: threadlocal示例
 *
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-01-05 15:25:12
 */
public class ThreadLocalExample implements Runnable{

    //SimpleDateFormat 非线程安全,把它存在ThreadLocal，每个线程都有各自的副本
    private static final ThreadLocal<SimpleDateFormat> formatt =
            new ThreadLocal<SimpleDateFormat>() {
                @Override
                protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyyMMdd:HHmm");
                }
            };

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample example = new ThreadLocalExample();
        for(int i = 0;i < 10;i++) {
            Thread t = new Thread(example,"Thread-" + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    public void run() {
        //原始format
        System.out.println("threadName:" + Thread.currentThread().getName() + "default formatter:" +
                formatt.get().toPattern());
        //不同的休眠时间
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //变更后的format
        formatt.set(new SimpleDateFormat());
        System.out.println("threadName:" + Thread.currentThread().getName() + "change formatter:" +
                formatt.get().toPattern());

    }
}
