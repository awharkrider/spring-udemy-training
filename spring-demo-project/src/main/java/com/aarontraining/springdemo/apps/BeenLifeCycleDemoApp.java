package com.aarontraining.springdemo.apps;

import com.aarontraining.springdemo.Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App demonstrating bean lifecycle from section 6
 */
public class BeenLifeCycleDemoApp {
    
    public static void main(String[] args) {
        
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beenLifeCycle-applicationContext.xml");
        
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        System.out.println(theCoach.getDailyWorkout());
        
        //close the context
        context.close();
        
    }
}
