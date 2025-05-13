package com.notification.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }


    public void registerUser(User user){
if(userRepository.findByEmail(user.getEmail()) != null){
    throw  new IllegalArgumentException("User with email" + user.getEmail() + "Already Exists!");

}

userRepository.save(user);
notificationService.send("You Registered Successfully",user.getEmail());
    }
}
