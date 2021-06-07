package cn.suanfa;


import cn.zq.threadtest.AQS.threadlocal.ThreadLocalExample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-03-22 10:26:56
 */
public class dem1 implements Runnable{

    // SimpleDateFormat 不是线程安全的，所以每个线程都要有自己独立的副本
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    /** 总数 */
    private static int total = 100_000;

    public static void main(String[] args) throws InterruptedException {
        //demo12();
        //parall();
        //filter();
    }

    private static void filter() {
        List<String> words = Arrays.asList("wmyskxz", "say", "wow", "to", "everybody");
        //words.stream().filter(word -> word.startsWith("w")).forEach(System.out::println);
        List<String> filteredWords = words.stream().filter(word -> word.startsWith("w")).collect(Collectors.toList());
        filteredWords.forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2, 1, 3, 4);
        numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .forEach(System.out::println);
        List<Integer> numberss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numberss.stream()
                .filter(integer -> integer % 2 == 0)
                .limit(3)
                .forEach(System.out::println);
        List<Integer> numbersss = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbersss.stream()
                .filter(integer -> integer % 2 == 0)
                .skip(2)
                .forEach(System.out::println);
    }

    private static void demo12() {
    /* ThreadLocalExample obj = new ThreadLocalExample();
     for(int i=0 ; i<10; i++){
         Thread t = new Thread(obj, ""+i);
         Thread.sleep(new Random().nextInt(1000));
         t.start();
     }*/
        /*List<String> title = Arrays.asList("Wmyskxz", "Is", "Learning", "Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);*/
    }

    private static void parall() {
        System.out.println(String.format("本计算机的核数：%d", Runtime.getRuntime().availableProcessors()));

        // 产生1000w个随机数(1 ~ 100)，组成列表
        Random random = new Random();
        List<Integer> list = new ArrayList<>(total);

        for (int i = 0; i < total; i++) {
            list.add(random.nextInt(100));
        }

        long prevTime = getCurrentTime();
        list.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
        System.out.println(String.format("单线程计算耗时：%d", getCurrentTime() - prevTime));

        prevTime = getCurrentTime();
        // 只需要加上 .parallel() 就行了
        list.stream().parallel().reduce((a, b) -> a + b).ifPresent(System.out::println);
        System.out.println(String.format("多线程计算耗时：%d", getCurrentTime() - prevTime));
    }

    private static long getCurrentTime() {
        return System.currentTimeMillis();
    }


    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //formatter pattern is changed here by thread, but it won't reflect to other threads
        formatter.set(new SimpleDateFormat());

        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get().toPattern());
    }

}

