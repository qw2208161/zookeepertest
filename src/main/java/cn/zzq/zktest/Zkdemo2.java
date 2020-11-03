package cn.zzq.zktest;

import org.apache.zookeeper.*;

import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-11-03 16:07:38
 */
public class Zkdemo2 implements Watcher {
    private static CountDownLatch connectedSemaphore = new CountDownLatch(1);
    private static ZooKeeper zk = null;
    public static void main(String[] args) throws Exception {
        String path = "/zk-book4";
        zk = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 5000,
                new Zkdemo2());
        connectedSemaphore.await();
        zk.create(path,"".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        zk.create(path + "/c1","".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);

        List<String> chilirenList = zk.getChildren(path,true);
        System.out.println(chilirenList);

        zk.create(path + "/c2","".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        zk.create(path + "/c3","".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        zk.create(path + "/c4","".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        Thread.sleep(Integer.MAX_VALUE);

    }
    public void process(WatchedEvent event) {
        if(Event.KeeperState.SyncConnected == event.getState()) {
            if(Event.EventType.None == event.getType() && null == event.getPath()) {
                connectedSemaphore.countDown();
            }else if (event.getType() == Event.EventType.NodeChildrenChanged) {
                try {
                    System.out.println("RegetChild:" + zk.getChildren(event.getPath(),true));
                }catch (Exception e) {}
            }
        }
    }
}
