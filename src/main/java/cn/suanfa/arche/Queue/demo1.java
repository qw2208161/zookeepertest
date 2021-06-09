package cn.suanfa.arche.Queue;

import java.util.TooManyListenersException;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-08 17:41:56
 */
public class demo1 {
    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        int[] arrays = {9, 2, 5, 1, 3, 8};
        int max = findMaxN(arrays,2);
        System.out.println(max);
        for(int i = 0;i < arrays.length;i++) {
            System.out.println(arrays[i]);
        }
    }
    public static int findMaxN(int[] a, int n){
        int res ;
        int partion = partionByGt(a, 0, a.length - 1);
        while (partion + 1 != n) {
            if (partion + 1 > n) {
                partion = partionByGt(a, 0, partion - 1);
            }else{
                partion = partionByGt(a, partion+1, a.length-1);
            }
        }
        res = a[partion];
        return res;
    }
    /**
     * 和partionIndex方法逻辑大致一样，判断条件为大于
     * 将大于分区值得数全部移位到左边
     * @param a
     * @param startIndex
     * @param endIndex
     * @return
     */
    private static int partionByGt(int[] a, int startIndex,int endIndex) {
        int i = startIndex;
        int j = startIndex;
        int temp ;
        for (; j < endIndex; j++) {
            if (a[j] > a[endIndex]) {
                if (i != j) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
                i+=1;
            }
        }
        temp = a[endIndex ];
        a[endIndex] = a[i];
        a[i] = temp;
        return i;
    }
}
