package cn.algorithm.BinarySearch;


/**
 * description: 变体四：查找最后一个小于等于给定值的元素
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-10 14:33:54
 */
public class BinarySearch4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int index = bSearch(arr,arr.length,9);
        System.out.println("查找最后一个小于等于给定值的元素的位置为：" + index);
    }

    public static int bSearch(int[] arr,int length, int value) {
        //1.定义高低
        int low = 0;
        int high = length - 1;
        while(low <= high) {
            //2.取mid
            int mid = low + ((high - low) >> 1);
            if(arr[mid] <= value) {
                if((mid == length - 1) || (arr[mid + 1] > value)) {
                    return mid;
                }else {
                    low = mid + 1;
                }
            }else {
                high = low + 1;
            }
        }
        return - 1;
    }
}
