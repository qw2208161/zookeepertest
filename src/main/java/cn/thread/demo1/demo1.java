package cn.thread.demo1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-02-19 09:41:52
 */
public class demo1 {
        public static void main(String[] args) {
            // 获取 Java 线程管理 MXBean
            ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
            // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程信息
            ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,
                    false);
            // 遍历线程信息，仅打印线程 ID 和线程名称信息
            for (ThreadInfo threadInfo : threadInfos) {
                System.out.println("[" + threadInfo.getThreadId() + "] " +
                        threadInfo.getThreadName());
            }
        }
}
