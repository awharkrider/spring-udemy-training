package com.aarontraining.springdemo.Models;

import com.aarontraining.springdemo.fortune_service.FortuneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Class for section 8 @Autowired constructor injection
 */
@Component
public class TableTennisCoach implements Coach {
    
    @Autowired // <--- Field Injection, not recommended by spring.
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    
    public TableTennisCoach() {}
    
    @Override
    public String getDailyWorkout() {
        return "TableTennisCoach: Practice your bounce return";
    }
    
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
