package cn.suanfa;

/**
 * description: 归并排序
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-03-16 13:57:09
 */
public class Merge {
    public static void main(String[] args) {
        int[] arrays = {9, 2, 5, 1, 3, 2, 9, 5, 2, 1, 8};
        //归并排序方法
        mergeSort(arrays, 0, arrays.length - 1);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    /**
     * description:先排序，后合并
     *
     * @param
     * @return
     * @author 周志钦（zhiqin.zhou@ucarinc.com）
     * @date 2021/3/16 14:01
     */
    private static void mergeSort(int[] arrays, int L, int R) {
        if (L == R) {
            return;
        } else {
            //取中间点为分割点
            int mid = (L + R) / 2;
            //递归
            mergeSort(arrays, L, mid);
            mergeSort(arrays, mid + 1, R);
            //合并
            merge(arrays, L, mid + 1, R);
        }
    }

    private static void merge(int[] arrays, int L, int M, int R) {
        //1.左边数组 和 右边数组
        int[] leftArrays = new int[M - L];
        int[] rightArrays = new int[R - M + 1];
        //2.往这些数组里面填充数据  左边是 L<= ? < M;右边是 M<=?<R
        for (int i = L; i < M; i++) {
            leftArrays[i - L] = arrays[i];
        }
        for (int j = M; j <= R; j++) {
            rightArrays[j - M] = arrays[j];
        }
        int i = 0, j = 0;
        //array数组的第一个元素
        int k = L;

        //两边都没完的情况下
        while (i < leftArrays.length && j < rightArrays.length) {
            if (leftArrays[i] < rightArrays[j]) {
                arrays[k] = leftArrays[i];
                //移动
                k++;
                i++;
            } else {
                arrays[k] = rightArrays[j];
                //移动
                k++;
                j++;
            }
        }

        //右边完了情况下
        while (i < leftArrays.length) {
            arrays[k] = leftArrays[i];
            //移动
            k++;
            i++;

        }

        //左边完了情况下
        while (j < rightArrays.length) {
            arrays[k] = rightArrays[j];
            //移动
            k++;
            j++;

        }

    }

}
