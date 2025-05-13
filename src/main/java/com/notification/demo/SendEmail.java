package com.notification.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class SendEmail implements NotificationService {

        @Value("${mail.host}")
        private String host;

        @Value("${mail.port}")
        private String port;

    public void send(String message , String recipientEmail){
        System.out.println("Sending Email...");
        System.out.println("Recipient: " + recipientEmail);
        System.out.println("Message: " + message);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);

    }
}
