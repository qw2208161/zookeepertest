package cn.suanfa.arche.Queue;

import sun.security.util.Length;

/**
 * description: 找到第K个小的数
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-08 17:59:09
 */
public class demo2 {
    public static void main(String[] args) {
        int[] arrays = {9, 2, 5, 1, 3, 8};
        int min = findMin(arrays,2);
        System.out.println(min);
        for(int i = 0;i < arrays.length;i++) {
            System.out.println(arrays[i]);
        }
    }

    public static int findMin(int[] arr,int k) {
        int res;
        int partion = partionByGt2(arr,0,arr.length - 1);
        while(partion + 1 != k) {
            if(partion + 1 > k) {
                partion = partionByGt2(arr, 0, partion - 1);
            }else {
                partion = partionByGt2(arr, partion + 1, arr.length - 1);
            }
        }
        res = arr[partion];
        return res;
    }

    public static int partionByGt2(int[] arr, int start, int end) {
        int i = start;
        int j = start;
        //以end为哨兵
        int temp ;
        for(;j < end;j++) {
            if(arr[j] < arr[end]) {
                if(i != j) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            i++;
        }
        temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
}
