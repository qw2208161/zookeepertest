package cn.zn.dubbotest.common.service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-07 13:42:55
 */
public class Demo1 {
    public static void main(String[] args) {
        ServiceLoader<AobingService> serviceLoader =
                ServiceLoader.load(AobingService.class);
        Iterator<AobingService> iterator = serviceLoader.iterator();
        while(iterator.hasNext()) {
            AobingService aobingService = iterator.next();
            aobingService.say();
        }
    }
}
