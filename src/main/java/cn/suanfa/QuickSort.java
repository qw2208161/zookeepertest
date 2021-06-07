package cn.suanfa;

/**
 * description: 快排
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-03-16 14:56:46
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {89,100,55,13,1, 4, 5, 67, 2, 7, 8, 6, 9, 44};
        //快排
        quickSortMethod(arr,0,arr.length-1);
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
    * description:<快排方法>
     *     先定义一个支点，小于支点的放左边，大于支点的放右边
    * @author 周志钦（zhiqin.zhou@ucarinc.com）
    * @date 2021/3/16 14:59
    * @param
    * @return
    */
    private static void quickSortMethod(int[] arr, int L, int R) {
       // int[] arr = {1, 4, 5, 67, 2, 7, 8, 6, 9, 44};
        int mid = (L + R) / 2;
        //先找支点
        int pivot = arr[mid];
        int i = L, j = R;
        //开始走
        while (i <= j) {
            while (arr[i] < pivot) {
                //小于等于就向右走
                i++;
            }

            while (arr[j] > pivot) {
                //大于等于就向左走
                j--;
            }

            //到这代表，当前需要i和j需要进行交换
            if(i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //继续走
                i++;
                j--;
            }
        }

        if(L < j) {
            quickSortMethod(arr,L,j);
        }

        if(i < R) {
            quickSortMethod(arr,i,R);
        }
    }
}
