package com.aarontraining.springdemo;

/**
 * Basic Class to demonstrate
 */
public class BaseballCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }
}
