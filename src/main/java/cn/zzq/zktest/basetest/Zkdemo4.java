package cn.zzq.zktest.basetest;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-07 20:26:29
 */
public class Zkdemo4 {
    public static void main(String[] args) throws Exception {
        ZooKeeper zk = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000, new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println("事件类型：" + event.getType());
                System.out.println("事件发生路径：" + event.getPath());
                System.out.println("通知状态为：" + event.getState());
            }
        });
        List<String> list= zk.getChildren("/",null,null);
        for (String group : list) {

                System.out.println(group);                   //List<String> msg = zkc.getChildren("/" + group + "/" + interfaceName + "/providers");//这样可以获得接口的提供者

        }
        zk.close();
    }
}
