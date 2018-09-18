package com.aarontraining.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * My first app using spring
 *
 */
public class HelloSpringApp {
    
    public static void main(String[] args) {
        
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
    
        Coach yourCoach = context.getBean("yourCoach", Coach.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(yourCoach.getDailyWorkout());
        
        //close the context
        context.close();
        
    }
}
