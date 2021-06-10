package cn.algorithm.BinarySearch;


/**
 * description: 变体二：查找最后一个值等于给定值的元素
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-10 14:33:54
 */
public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int index = bSearch(arr,arr.length,8);
        System.out.println("最后一个出现的元素所在的位置为：" + index);
    }

    public static int bSearch(int[] arr,int length, int value) {
        //1.定义高低
        int low = 0;
        int high = length - 1;
        while(low <= high) {
            //2.取mid
            int mid = low + ((high - low) >> 1);
            if(arr[mid] > value) {
                high = mid - 1;
            }else if(arr[mid] < value) {
                low = mid + 1;
            }else {
                if((mid == length - 1) || (arr[mid + 1] != value)) {
                    //3.若mid为终点点，或者mid后一个点不等于值就返回
                    return mid;
                }else {
                    low = mid + 1;
                }
            }
        }
        return - 1;
    }
}
