package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)

public class StatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("The following tests are in progress.");
    }


    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests have been successfully completed.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("The test #" + testCounter + " is in progress");
    }

    @Test
    void testWhenNumberOfPostsZero() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        Mockito.when(calculationS.userNames()).thenReturn(List.of("user1", "user2"));
        Mockito.when(calculationS.postsCount()).thenReturn(0);
        Mockito.when(calculationS.commentsCount()).thenReturn(20);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(2, statisticsCalculation.getUserCount());
        Assertions.assertEquals(0, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(20, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(0, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(10, statisticsCalculation.getAvCommentsperUser());
    }

    @Test
    void testWhenNumberOfPostsOneThousand() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        Mockito.when(calculationS.userNames()).thenReturn(List.of("user1", "user2"));
        Mockito.when(calculationS.postsCount()).thenReturn(1000);
        Mockito.when(calculationS.commentsCount()).thenReturn(20);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(2, statisticsCalculation.getUserCount());
        Assertions.assertEquals(1000, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(20, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(500, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(10, statisticsCalculation.getAvCommentsperUser());
    }

    @Test
    void testWhenNumberOfCommentsZero() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        Mockito.when(calculationS.userNames()).thenReturn(List.of("user1", "user2"));
        Mockito.when(calculationS.postsCount()).thenReturn(100);
        Mockito.when(calculationS.commentsCount()).thenReturn(0);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(2, statisticsCalculation.getUserCount());
        Assertions.assertEquals(100, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(0, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(50, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsperUser());
    }

    @Test
    void testWhenNumberOfCommentsLessThanPosts() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        Mockito.when(calculationS.userNames()).thenReturn(List.of("user1", "user2"));
        Mockito.when(calculationS.postsCount()).thenReturn(100);
        Mockito.when(calculationS.commentsCount()).thenReturn(2);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(2, statisticsCalculation.getUserCount());
        Assertions.assertEquals(100, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(2, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(50, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(1, statisticsCalculation.getAvCommentsperUser());
    }

    @Test
    void testWhenNumberOfCommentsMoreThanPosts() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        Mockito.when(calculationS.userNames()).thenReturn(List.of("user1", "user2"));
        Mockito.when(calculationS.postsCount()).thenReturn(100);
        Mockito.when(calculationS.commentsCount()).thenReturn(200);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(2, statisticsCalculation.getUserCount());
        Assertions.assertEquals(100, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(200, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(50, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(2, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(100, statisticsCalculation.getAvCommentsperUser());
    }

    @Test
    void testWhenNumberOfUsersZero() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        Mockito.when(calculationS.userNames()).thenReturn(List.of());
        Mockito.when(calculationS.postsCount()).thenReturn(100);
        Mockito.when(calculationS.commentsCount()).thenReturn(2);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(0, statisticsCalculation.getUserCount());
        Assertions.assertEquals(100, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(2, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(0, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(0, statisticsCalculation.getAvCommentsperUser());
    }

    @Test
    void testWhenNumberOfUsersHundred() {
        //Given
        Statistics calculationS = mock(Statistics.class);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation();

        List<String> userNameLists = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String theUser1 = "user" + i;
            userNameLists.add(theUser1);
        }

        Mockito.when(calculationS.userNames()).thenReturn(userNameLists);
        Mockito.when(calculationS.postsCount()).thenReturn(100);
        Mockito.when(calculationS.commentsCount()).thenReturn(200);


        //When
        statisticsCalculation.calculateAdvStatistics(calculationS);

        //Then
        Assertions.assertEquals(100, statisticsCalculation.getUserCount());
        Assertions.assertEquals(100, statisticsCalculation.getPostsCount());
        Assertions.assertEquals(200, statisticsCalculation.getCommentsCount());
        Assertions.assertEquals(1, statisticsCalculation.getAvPostsPerUser());
        Assertions.assertEquals(2, statisticsCalculation.getAvCommentsPerPost());
        Assertions.assertEquals(2, statisticsCalculation.getAvCommentsperUser());
    }
}
