package cn.suanfa;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-03-19 11:16:35
 */
public class demo1 {
    static   CopyOnWriteArrayList arra1 = new CopyOnWriteArrayList(){
        @Override
        public String toString() {
            return CopyOnWriteArrayList.class.getName() + "@"
                    + Integer.toHexString(hashCode());
        }
    };
    public static void main(String[] args) {
        ArrayList<String> scArray = new ArrayList<>();
        scArray.add("!");
        scArray.add("111");
        System.out.println(scArray);
    }


        /*new Thread(new Runnable() {
            @Override
            public void run() {
                arra1.add("xxxx");
                System.out.println(arra1 + "1");

                arra1.add("1111");
                System.out.println(arra1+ "1");

                arra1.add("2222");
                System.out.println(arra1+ "1");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                arra1.clear();
                System.out.println(arra1+ "2");
            }
        }).start();

        System.out.println(arra1 + "main");
        }*/
    }

