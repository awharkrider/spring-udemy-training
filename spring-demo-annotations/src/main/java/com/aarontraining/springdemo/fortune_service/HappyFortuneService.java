package com.aarontraining.springdemo.fortune_service;

import org.springframework.stereotype.Component;

/**
 * Section 7: Spring autowired dependency injection
 */
@Component
public class HappyFortuneService implements FortuneService {

    
    /**
     * Simple fortune
     *
     * @return hard coded string as our example
     */
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
    

}
