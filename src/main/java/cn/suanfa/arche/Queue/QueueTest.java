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
        //testArray();
        //testLoop();
       /* LinkedQueue linkedQueue = new LinkedQueue();
        for(int i = 0;i < 4;i++) {
            linkedQueue.enqueue("a" + i);
        }
        System.out.println(linkedQueue.toString());
        String a = linkedQueue.dequeue();
        System.out.println(a);*/
    }

    private static void testLoop() {
        LoopArrayQueue loopArrayQueue = new LoopArrayQueue(8);
        for(int i = 0;i < 8;i++) {
            loopArrayQueue.enqueue("a" + i);
        }
        boolean flag = loopArrayQueue.enqueue("aaa");
        System.out.println(flag);
        String out = loopArrayQueue.dequeue();
        loopArrayQueue.dequeue();
        loopArrayQueue.dequeue();
        System.out.println(out);
        boolean flag2 = loopArrayQueue.enqueue("aaa1");
        loopArrayQueue.enqueue("aaa2");
        loopArrayQueue.enqueue("aaa3");
        System.out.println(loopArrayQueue.toString());
    }

    private static void testArray() {
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
