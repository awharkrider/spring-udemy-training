package com.aarontraining.springdemo.apps;

import com.aarontraining.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App demonstrating bean scope from section 6
 */
public class BeenScopeDemoApp {
    
    public static void main(String[] args) {
        
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beenScope-applicationContext.xml");
        
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        
        // Check if the are teh same been
        boolean result = (theCoach == alphaCoach);
        
        
        
        // print out results
        System.out.println("\nPointing to the same object: " + result);
    
        System.out.println("\nMemory location for theCouch: " + theCoach);
    
        System.out.println("\nMemory location for alphaCouch: " + alphaCoach);
        
        //close the context
                context.close();
        
    }
}
