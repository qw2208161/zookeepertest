/*
package cn.zq.threadtest.AQS;


import java.util.HashMap;
import java.util.UUID;

*/
/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-11 15:19:21
 *//*

public class Test {
    public static void main(String[] args) throws InterruptedException {
        final HashMap<String,String> map = new HashMap<String, String>();
        Thread t = new Thread(new Runnable() {
            public void run() {
                for(int i = 0;i < 2500;i++) {
                    new Thread(new Runnable() {
                        public void run() {
                            map.put(UUID.randomUUID().toString(),"");
                        }
                    },"ftf" + i).start();
                }
            }
        },"ftf");
        t.start();
        Thread.sleep(3000);
        t.join();
        System.out.println(map.size());

    }
}
*/
