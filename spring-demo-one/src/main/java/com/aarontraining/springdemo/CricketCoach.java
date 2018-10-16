package com.aarontraining.springdemo;

import com.aarontraining.springdemo.fortune_service.FortuneService;

/**
 * Class for setter injection example
 * System.out.println used for Diagnostic and training
 */
public class CricketCoach implements Coach {
    
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    
    public CricketCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    
    public CricketCoach() {
        //default constructor
        System.out.println("Diagnostic CricketCoach: default constructor");
    }
    
    public void setEmailAddress(String emailAddress) {
        //sys out to see example
        System.out.println("Diagnostic CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }
    
    public void setTeam(String team) {
        //sys out to see example
        System.out.println("Diagnostic CricketCoach: inside setter method - setTeam");
        this.team = team;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public String getTeam() {
        return team;
    }
    
    /**
     * Setter method for setter injection
     * 
     * @param fortuneService -
     */
    public void setFortuneService(FortuneService fortuneService) {
        //sys out to see example
        System.out.println("Diagnostic CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "Cricket: Practice fast bowling for 15 minutes.";
    }
    
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    public String getRandomFortune() {
        return fortuneService.getRandomFortune();
    }
    
}
