package com.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    @Autowired
    WhatsappRepository whatsappRepository;

//    public String createUser(User user){
//        WhatsappRepository.createUser(user);
//    }

    public String createUser(String name, String mobile) {
        return " Success";
    }

    public Group createGroup(List<User> users) {

    }

    public int createMessage(String content) {
    }

    public int sendMessage(Message message, User sender, Group group) {
    }

    public String changeAdmin(User approver, User user, Group group) {
    }

    public int removeUser(User user) {
    }

    public String findMessage(Date start, Date end, int k) {
    }
}
