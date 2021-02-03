package com.zzq.springtest.demo;

import com.zzq.springtest.service.impl.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description: 测试源码
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2021-02-03 10:52:44
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * 1.加载Spring的配置文件
         * 2.取出Bean容器中的实例
         * 3.调用bean方法
         */
        // 1.加载Spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2.取出Bean容器中的实例
        HelloService helloService = (HelloService) context.getBean("helloService");
        // 3.调用bean方法
        helloService.hello();
    }
}
