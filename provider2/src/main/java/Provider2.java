import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

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

public class Provider2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
