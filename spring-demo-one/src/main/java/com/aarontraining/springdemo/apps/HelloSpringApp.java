package com.aarontraining.springdemo.apps;

import com.aarontraining.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * My first app using spring
 *
 */
public class HelloSpringApp {
    
    public static void main(String[] args) {
        
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve bean from spring container NOTE: since it has the dependency for FortuneService spring will inject it for us.
        Coach theCoach = context.getBean("myCoach", Coach.class);
    
        Coach yourCoach = context.getBean("yourCoach", Coach.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(yourCoach.getDailyWorkout());
        
        //call method on bean of the injected service
        System.out.println(theCoach.getDailyFortune());
        
        //close the context
        context.close();
        
    }
}
