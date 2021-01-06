package cn.zzq.zktest;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-11-19 17:42:46
 */
public class demo1 {
     /*  Executor executor = Executors.newFixedThreadPool(1);
    final CyclicBarrier barrier = new CyclicBarrier(2, ()->{ executor.execute(()->check()); });
*/
     private static volatile int m;
    private void check() {
        synchronized (this) {
            m = 10;
            System.out.println("today is a good day");
        }
    }
}
