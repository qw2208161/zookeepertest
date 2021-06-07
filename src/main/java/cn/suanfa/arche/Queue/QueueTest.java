package cn.suanfa.arche.Queue;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-07 16:50:06
 */
public class QueueTest {
    public static void main(String[] args) {
        //test Array
        ArrayQueue arrayQueue = new ArrayQueue(8);
        for(int i = 0;i < 8;i++) {
            arrayQueue.enqueue("a" + i);
        }
        boolean flag = arrayQueue.enqueue("aaa");
        System.out.println(flag);
        String out = arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        System.out.println(out);
        boolean flag2 = arrayQueue.enqueue("aaa1");
        arrayQueue.enqueue("aaa2");
        arrayQueue.enqueue("aaa3");
        System.out.println(arrayQueue.toString());
    }


}
