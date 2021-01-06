package cn.zq.threadtest.AQS.threadlocal;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    public static class OOMObject {
    }

    public static void main(String[] args) {
        //-Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=E:/java/jdk8/jre/heapdump1.txt
        /*List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }*/
        HeapOOM a = new HeapOOM();
        a.testRuntimeConstantPoolOOM();
    }

    public void testRuntimeConstantPoolOOM() {
        //VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
        // 使用List保持着常量池的引用，避免Full GC回收常量池
        List<String> list = new ArrayList<String>();
        // 10MB的PermSize在Integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}

