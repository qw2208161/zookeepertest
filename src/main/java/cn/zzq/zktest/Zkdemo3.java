package cn.zzq.zktest;

import org.apache.zookeeper.*;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-11-03 17:08:34
 */
public class Zkdemo3 implements Watcher{
    private static CountDownLatch connectedSemaphore = new CountDownLatch(1);
    private static ZooKeeper zk = null;
    public static void main(String[] args) throws Exception {
        String path = "/zk-book5";
        zk = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 5000,
                new Zkdemo3());
        connectedSemaphore.await();
        zk.exists(path,true);
        zk.create(path,"".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.setData(path,"123".getBytes(),-1);

        zk.create(path + "/c1","".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        zk.delete(path + "/c1",-1);

        zk.delete(path,-1);

        Thread.sleep(Integer.MAX_VALUE);

    }


    public void process(WatchedEvent event) {
        try {
            if (Watcher.Event.KeeperState.SyncConnected == event.getState()) {
                if (Watcher.Event.EventType.None == event.getType() && null == event.getPath()) {
                    connectedSemaphore.countDown();
                } else if (event.getType() == Watcher.Event.EventType.NodeCreated) {
                    System.out.println("Node(" + event.getPath() + ")created");
                    zk.exists(event.getPath(), true);
                } else if (event.getType() == Watcher.Event.EventType.NodeDeleted) {
                    System.out.println("Node(" + event.getPath() + ")deleted");
                    zk.exists(event.getPath(), true);
                } else if (event.getType() == Watcher.Event.EventType.NodeDataChanged) {
                    System.out.println("Node(" + event.getPath() + ")dataChanged");
                    zk.exists(event.getPath(), true);
                }
            }
        }catch (Exception e) {}
    }
}
