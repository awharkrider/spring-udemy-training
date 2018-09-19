package com.aarontraining.springdemo;

import com.aarontraining.springdemo.fortune_service.FortuneService;

/**
 * Basic Class to demonstrate
 */
public class BaseballCoach implements Coach {
    
    private FortuneService fortuneService;
    
    /**
     * Constructor: for Section 5: Spring dependency injection
     * 
     * @param theFortuneService passed in using Spring Bean dependency injection
     */
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }
    
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    @Override
    public void setFortuneService(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
}
