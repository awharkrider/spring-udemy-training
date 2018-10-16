package com.aarontraining.springdemo.Models;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "derp";
    }
}
