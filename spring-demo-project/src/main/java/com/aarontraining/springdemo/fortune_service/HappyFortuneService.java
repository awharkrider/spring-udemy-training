package com.aarontraining.springdemo.fortune_service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Section 5: Spring dependency injection
 */
public class HappyFortuneService implements FortuneService {
    
    
    private List<String> fortunes;
    private String fortune;
    
    public HappyFortuneService() {
        this.fortunes = Arrays.asList("The fortune you seek is in another cookie.", "Cookie Monster ate your fortune, try again.", "A conclusion is simply the place where you got tired of thinking.");
    }
    
    /**
     * Simple fortune
     *
     * @return hard coded string as our example
     */
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
    
    /**
     * Getting a random fortune
     *
     * Practice activity #2
     * @return - String of a random fortune
     */
    @Override
    public String getRandomFortune() {
        Random random = new Random();
        int pick = random.nextInt(fortunes.size());
        return fortunes.get(pick);
    }
}
