package com.YGeneration.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
//Given
        User millenials = new Millenials("Millenials");
        User zGeneration = new ZGeneration("ZGeneration");
        User yGeneration = new YGeneration("YGeneration");

        //When
        String millenialsPost = millenials.sharePost();
        System.out.println("Millenials posts at: " + millenialsPost);
        String zGenerationPost = zGeneration.sharePost();
        System.out.println("ZGeneration posts at: " + zGenerationPost);
        String yGenerationPost = yGeneration.sharePost();
        System.out.println("YGeneration posts at: " + yGenerationPost);

        //Then
        assertEquals("Facebook", millenialsPost);
        assertEquals("Snapchat", zGenerationPost);
        assertEquals("Twitter", yGenerationPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Millenials");

        //When
        String millenialsPost = millenials.sharePost();
        System.out.println("Millenials posts at: " + millenialsPost);
        millenials.setSocialPublisher(new TwitterPublisher());
        millenialsPost = millenials.sharePost();
        System.out.println("Millenials posts now at: " + millenialsPost);

        //Then
        assertEquals("Twitter", millenialsPost);
    }
}
