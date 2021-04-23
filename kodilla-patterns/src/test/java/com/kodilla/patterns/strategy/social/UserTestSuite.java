package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Social Media Users")
public class UserTestSuite {

    @DisplayName("Test Default Sharing Strategies")
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User krzysztof = new Millenials("Krzysztof");
        User magdalena = new YGeneration("Magdalena");
        User henryk = new ZGeneration("Henryk");

        //When
        String millenials = krzysztof.sharePost();
        System.out.println("Krzysztof uses social media - " + millenials);
        String snapchat = magdalena.sharePost();
        System.out.println("Magdalena uses social media - " + snapchat);
        String twitter = henryk.sharePost();
        System.out.println("Henryk uses social media - " + twitter);

        //Then
        assertEquals("[Facebook Publisher]", millenials);
        assertEquals("[Snapchat Publisher]", snapchat);
        assertEquals("[Twitter Publisher]", twitter);

    }

    @DisplayName("Test Individual Sharing Strategy")
    @Test
    void testIndivdualSharingStrategy() {
        //Given
        User jolanta = new Millenials("Jolanta");

        //When
        String millenials = jolanta.sharePost();
        System.out.println("Jolanta uses social media - " + millenials);
        jolanta.setSocialPublisher(new TwitterPublisher());
        String newSharePost = jolanta.sharePost();
        System.out.println("Jolanta uses social media - " + newSharePost);

        //Then
        assertEquals("[Twitter Publisher]", newSharePost);

    }
}