package com.aarontraining.springdemo.Apps;

import com.aarontraining.springdemo.Models.Coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    
    public static void main(String[] args) {
        
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //get the bean from spring container
        //        Coach theCoach = context.getBean("sillyCoach", Coach.class);  // <-- @Component("sillyCoach") indicating the id this also works the same way
        Coach theCoach = context.getBean("tennisCoach", Coach.class); // <-- using the default bean id this also works the same way
        
        //        Coach theCoach = context.getBean(TennisCoach.class); //  <-- also works the same way
        
        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        //close the context
        context.close();
        
    }
    
}
