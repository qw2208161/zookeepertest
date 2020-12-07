package cn.zn.dubbotest.common.service.impl;

import cn.zn.dubbotest.common.service.AobingService;

/**
 * description: 该文件说明
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-07 13:41:55
 */
public class BobingServiceImpl implements AobingService {
    @Override
    public String hello(String name) {
        return null;
    }

    @Override
    public void say() {
        System.out.println("B");
    }
}
