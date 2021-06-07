package cn.suanfa.arche.Queue;

/**
 * description: 使用数组实现队列
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-07 16:40:33
 */
public class ArrayQueue {
    //数组
    private String[] items;
    //数组长度
    private int n;
    private int size;
    private int head = 0;
    private int tail = 0;

    public  ArrayQueue(int length) {
        items = new String[length];
        n = length;
    }

    //入队操作
    public boolean enqueue(String item) {
        //1.满了情况
        if(head == 0 && tail == n) {
            return false;
        }else if(head != 0 && tail == n) {
            //证明有些地方因为出队置空了，需要进行迁移操作
            for(int i = head;i < tail;++i) {
                items[i - head] = items[i];
            }
            //迁移后需要变动head和tail位置
            tail = tail - head;
            head = 0;
        }
        //2.正常情况下
        items[tail++] = item;
        size++;
        return true;
    }

    //出队操作
    public String dequeue() {
        //1.如果为空的情况
        String res = null;
        if(head == tail) {return res;}
        res = items[head++];
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
