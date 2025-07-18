package com.spring.batch.project.writer;

import com.spring.batch.project.model.User;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserItemWriter {

    @Bean
    public JpaItemWriter<User> writer(EntityManagerFactory entityManagerFactory) {
        JpaItemWriter<User> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
}

