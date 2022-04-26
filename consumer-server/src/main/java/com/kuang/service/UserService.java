package com.kuang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author LIUYE
 * @version 1.0
 * @Date: 2022/04/26/21:45
 */
@Service
public class UserService {
    //想拿到provider-server提供的票，要去注册中心拿到服务
    @Reference
    TicketService ticketService;

    public void buyTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("在注册中心已经拿到票了");
    }

}
