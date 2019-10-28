import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Hello;

/**
 * Licensed to CMIOV.Inc. under the terms of the CMIOV
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date           Author               Version        Comments
 * 24/10/2019     Yang-QiYan           1.0            Initial Version
 */

public class Consumber {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        Hello hello = (Hello) context.getBean("helloService");

        System.out.println("向服务提供者1发送请求");
        byte[] hello1 = hello.sayHello("hello-world-provider-1",  "GET");
        System.out.println(new String(hello1));

        System.out.println("向服务提供者2发送请求");
        byte[] hello2 = hello.sayHello("hello-world-provider-2",  "POST");
        System.out.println(new String(hello2));
    }
}
