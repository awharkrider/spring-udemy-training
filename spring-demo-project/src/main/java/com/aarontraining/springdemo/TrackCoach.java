package com.aarontraining.springdemo;

import com.aarontraining.springdemo.fortune_service.FortuneService;

public class TrackCoach implements Coach {
    
    private FortuneService fortuneService;
    
    public TrackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
    
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    @Override
    public void setFortuneService(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
        
    }
    
    /**
     * init method to do initialization stuff in the bean
     */
    private void setupTrackCoach() {
        System.out.println("TrackCoach: inside method 'setupTrackCoach' -- init method --");
    }
    
    /**
     * destroy method: to clean up the bean
     */
    public void cleanupTrackCoach() {
        System.out.println("TrackCoach: inside method 'cleanupTrackCoach' -- destroy method --");
    }
}
