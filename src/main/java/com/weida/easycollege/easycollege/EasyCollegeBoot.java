package com.weida.easycollege.easycollege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans(value = {@ComponentScan(value = "com.weida.easycollege.controller") ,@ComponentScan(value = "com.weida.easycollege.service" ) })
@EnableJpaRepositories({"com.**.repository"})
@EntityScan("com.weida.easycollege.po")
public class EasyCollegeBoot {

    public static void main(String[] args) {
        SpringApplication.run(EasyCollegeBoot.class, args);
    }

}
