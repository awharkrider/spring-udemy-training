package com.aarontraining.springdemo.fortune_service;

import org.springframework.stereotype.Component;

/**
 * Section 8: Spring autowired dependency injection with @Qualifier
 */
@Component
public class RESTFortuneService implements FortuneService {
    
    /**
     * Simple fortune
     *
     * @return hard coded string as our example
     */
    @Override
    public String getFortune() {
        
        return "REST Fortune: A conclusion is simply the place where you got tired of thinking. ";
    }
    
}
