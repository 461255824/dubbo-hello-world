import dao.UserMapper;
import dto.UserModel;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
        context.start();
        System.out.println("服务1启动");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        System.out.println("获取userMapper");
        UserModel userModel = userMapper.getUser(1);
        System.out.println(userModel);
        System.in.read(); // 按任意键退出
    }
}
