package cn.suanfa.arche.Queue;

/**
 * description: 计数排序
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-06-09 16:35:57
 */
public class jishupaixu {
    public static void main(String[] args) {
        int[] arrays = {9, 3, 4, 5, 4, 2, 1, 2, 5, 1, 3, 8};
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
        countingSort(arrays,arrays.length);
        System.out.println("--------------");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
    }

    public static void countingSort(int[] a, int n) {
        if (n <= 1) return; // 查找数组中数据的范围
        int max = a[0];
        for (int i = 1; i < n; ++i) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        int[] c = new int[max + 1]; // 申请一个计数数组c，下标大小[0,max]
        for (int i = 0; i <= max; ++i) {
            c[i] = 0;
        } // 计算每个元素的个数，放入c中
        for (int i = 0; i < n; ++i) {
            c[a[i]]++;
        }
        System.out.println("--------------");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("--------------");
        // 依次累加
        for (int i = 1; i <= max; ++i) {
            c[i] = c[i - 1] + c[i];
        }
        System.out.println("--------------");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("--------------");
        // 临时数组r，存储排序之后的结果
        int[] r = new int[n]; // 计算排序的关键步骤，有点难理解
        for (int i = n - 1; i >= 0; --i) {
            int index = c[a[i]] - 1;
            r[index] = a[i];
            c[a[i]]--;
        }
        System.out.println("--------------");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
        }
        System.out.println("--------------");
        // 将结果拷贝给a数组
        for (int i = 0; i < n; ++i) {
            a[i] = r[i];
        }
        System.out.println("--------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("--------------");
    }

    public static void sort(int[] arr) {
        //1.先找出计数中最大范围，也是最大数
        //2.先用c[]存放个个个数出现的次数
        if (arr.length <= 1) {
            return;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        //3.初始化桶数
        int[] c = new int[max + 1];
        //4.统计出现的次数
        for (int i = 0; i <= max; i++) {
            c[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]]++;
        }
        //5.累计个个数的位置
        for (int i = 1; i <= max; i++) {
            c[i] = c[i - 1] + c[i];
        }
        //6.临时数组，存储排序后的结果
        int[] tmp = new int[arr.length];
        //7.从数组倒着扫，计算出现的次数
        for (int i = arr.length - 1; i >= 0; i--) {
            //比如arr[i] = 8,找到桶位置第八个 也是 8-1 的位置
            //分数小于等于8的所有人  然后 - 1
            //c的索引代表分数，索引上的值代表当前分数的所有人
            int index = c[arr[i]] - 1;
            //  代表 多少分 排在 第几名
            tmp[index] = arr[i];
            c[arr[i]]--;
        }

        //
        // 8.将结果拷贝给a数组
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = tmp[i];
        }
    }
}
