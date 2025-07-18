package com.spring.batch.project.processor;

import com.spring.batch.project.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserItemProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) {
        // Example transformation
        user.setName(user.getName().toUpperCase());
        return user;
    }
}
