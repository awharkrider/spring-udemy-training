package com.aarontraining.springdemo;

import com.aarontraining.springdemo.fortune_service.FortuneService;

public class HockeyCoach implements Coach {
    
    private FortuneService fortuneService;
    
    
    public HockeyCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Skate blue line to blue line 20 times!";
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
