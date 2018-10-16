package com.aarontraining.springdemo.Models;

import com.aarontraining.springdemo.fortune_service.FortuneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class for section 8 @Autowired setter injection
 */
@Component
public class ChessCoach implements Coach {
    
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> ChessCoach: setter injecting FortuneService through @Autowired");
        this.fortuneService = fortuneService;
    }
    
    private FortuneService fortuneService;
    
    public ChessCoach() {
        System.out.println(">> ChessCoach: default constructor");
    }
    
    /* constructor injection
    @Autowired
    public ChessCoach(FortuneService theFortuneService) {
        System.out.println("injecting FortuneService through @Autowired");
        fortuneService = theFortuneService;
    }
    */
    
    @Override
    public String getDailyWorkout() {
        return "ChessCoach: Practice your check mate strategy.";
    }
    
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
