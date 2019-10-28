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
package service;

public class HelloImpl implements Hello {
    @Override
    public byte[] sayHello(String serviceName, String methodName) {
        System.out.println("provider2 接收到请求:"+methodName);
        return "provider2 返回".getBytes();
    }
}
