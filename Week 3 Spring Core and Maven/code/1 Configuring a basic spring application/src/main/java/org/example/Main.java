package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Spring project configured successfully");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



    }
}