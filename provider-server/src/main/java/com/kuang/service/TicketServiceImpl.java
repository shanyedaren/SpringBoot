package com.kuang.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author LIUYE
 * @version 1.0
 * @Date: 2022/04/26/15:14
 */

//zookpper服务注册与发现
@Service//可以被扫描到，在项目自己启动就已经开始自动注册中心了
@Component
//这里使用componet注解，不适合使用service，因为service注解有两包，避免导包失误
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《狂神说Java》";
    }
}