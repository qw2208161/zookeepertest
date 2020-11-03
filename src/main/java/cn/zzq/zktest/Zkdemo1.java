package cn.zzq.zktest;

import org.apache.zookeeper.*;

public class Zkdemo1 {
    public static void main(String[] args) throws Exception {
        ZooKeeper zk = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000, new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println("事件类型：" + event.getType());
                System.out.println("事件发生路径：" + event.getPath());
                System.out.println("通知状态为：" + event.getState());
            }
        });
        // 创建一个目录节点
        String node1  = zk.create("/zzq3", "zkstudy".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
        // 创建一个子目录节点
        String node2 = zk.create("/zzq3/rpc", "rpcstudy".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(zk.getChildren("/zzq3",null));
        System.out.println((new String(zk.getData("/zzq3/rpc",true,null))));
        zk.close();
    }
}
