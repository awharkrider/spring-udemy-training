package com.aarontraining.springdemo.fortune_service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Section 8: Spring autowired dependency injection with @Qualifier
 */
@Component
public class CookieFortuneService implements FortuneService {
    
    private List<String> fortunes;
    
    public CookieFortuneService() {
        this.fortunes = Arrays.asList(
                "The fortune you seek is in another cookie.",
                "Cookie Monster ate your fortune, try again.",
                "Cookies!!! Fortune Cookies!!!");
    }
    
    /**
     * Simple fortune
     *
     * @return hard coded string as our example
     */
    @Override
    public String getFortune() {
        Random random = new Random();
        int pick = random.nextInt(fortunes.size());
        return fortunes.get(pick);
    }
}
