package cn.suanfa.arche.Queue;

/**
 * description: 循环队列
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-07 17:21:18
 */
public class LoopArrayQueue {
    private String[] items;
    private int n;
    private int size;
    private int head = 0;
    private int tail = 0;

    public LoopArrayQueue(int length) {
        items = new String[length];
        n = length;
    }

    public boolean enqueue(String item) {
        //满了的情况下
        if((tail + 1) % n == head) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % n;
        size++;
        return true;
    }

    public String dequeue() {
        String res = null;
        if(head == tail) {return res;}
        res  = items[head];
        head = (head + 1) % n;
        size--;
        return res;
    }
    @Override
    public String toString() {
        String res = "";
        for(String x : items) {
            res += x;
        }
        return res;
    }
}
