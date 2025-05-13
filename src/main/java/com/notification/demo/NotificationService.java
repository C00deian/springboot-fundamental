package com.notification.demo;

import org.springframework.stereotype.Service;


public interface NotificationService {
  void send(String message ,  String recipientEmail );
}
