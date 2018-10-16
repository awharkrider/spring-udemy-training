package com.aarontraining.springdemo;

import com.aarontraining.springdemo.fortune_service.FortuneService;

/**
 * Interface for any type of coach
 */
public interface Coach {
    
    public String getDailyWorkout();
    
    public String getDailyFortune();
    
    public void setFortuneService(FortuneService theFortuneService);
}
