package cn.zzq.zktest.auth;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * description: zk的权限控制
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-11-03 17:41:41
 */
public class AuthSample_GET  {
    final static String PATH = "/zk-boo-auth-test2";
    final static String PATH2 = "/zk-boo-auth-test2/child";

    public static void main(String[] args) throws Exception {
/*        ZooKeeper zk1 = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000,null);
        zk1.addAuthInfo("digest","foo:true".getBytes());
        zk1.create(PATH,"init1".getBytes(), ZooDefs.Ids.CREATOR_ALL_ACL, CreateMode.PERSISTENT);

        ZooKeeper zk2 = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000,null);
        zk2.addAuthInfo("digest","foo:true".getBytes());
        System.out.println(new String(zk2.getData(PATH,false,null)));*/
        ZooKeeper zk1 = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000,null);
        zk1.addAuthInfo("digest","foo:true".getBytes());
        zk1.create(PATH,"init1".getBytes(), ZooDefs.Ids.CREATOR_ALL_ACL, CreateMode.PERSISTENT);
        zk1.create(PATH2,"init1".getBytes(), ZooDefs.Ids.CREATOR_ALL_ACL, CreateMode.EPHEMERAL);

       try {
           ZooKeeper zk2 = new ZooKeeper(
                   "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000,null);
            zk2.delete(PATH2,-1);
       }catch (Exception e) {
           System.out.println("删除节点失败，" + e.getMessage());
       }

        ZooKeeper zk3 = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000,null);
        zk3.addAuthInfo("digest","foo:true".getBytes());
        zk3.delete(PATH2,-1);
        System.out.println("删除节点成功，" + PATH2);

        ZooKeeper zk4 = new ZooKeeper(
                "39.100.9.42:2181,39.100.9.42:2182,39.100.9.42:2183", 3000,null);
        zk4.delete(PATH,-1);
        System.out.println("删除节点成功，" + PATH);

    }

}
