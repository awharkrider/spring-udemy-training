package com.aarontraining.springdemo.Apps;

import com.aarontraining.springdemo.Models.ChessCoach;
import com.aarontraining.springdemo.Models.Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemoApp {
    
    public static void main(String[] args) {
        
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //get the bean from spring container
        Coach theCoach = context.getBean(ChessCoach.class);
        
        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
