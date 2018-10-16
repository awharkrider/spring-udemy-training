package com.aarontraining.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    
    public static void main(String[] args) {
        
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //get the bean from spring container
        Coach theCoach = context.getBean(TennisCoach.class);
//        Coach theCoach = context.getBean("sillyCoach", Coach.class);  // <-- this also works the same way
        
        // Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        //close the context
        context.close();
        
    }
}
