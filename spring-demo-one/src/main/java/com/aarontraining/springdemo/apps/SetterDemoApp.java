package com.aarontraining.springdemo.apps;

import com.aarontraining.springdemo.CricketCoach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    
    public static void main(String[] args) {
        
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        //call method on bean using injected service
        System.out.println(theCoach.getDailyFortune());
    
        System.out.println(theCoach.getRandomFortune());
        
        //call literal setter injection
        System.out.println((theCoach).getEmailAddress());
        System.out.println((theCoach).getTeam());
        
        //close the context
        context.close();
        
    }
}
