package cn.zn.dubbotest.common.service.impl;

import cn.zn.dubbotest.common.service.AobingService;

/**
 * description: 接口实现
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-07 11:40:13
 */
public class AobingServiceImpl implements AobingService {
    @Override
    public String hello(String name) {
        return "Yo man Hello，I am" + name;
    }

    @Override
    public void say() {
        System.out.println("a1");
    }
}
