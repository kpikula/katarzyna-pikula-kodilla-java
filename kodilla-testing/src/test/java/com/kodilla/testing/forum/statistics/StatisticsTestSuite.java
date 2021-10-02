package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.kodilla.testing.forum.statistics.*;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)

public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testWhenNumberOfPostsZero() {
        //Given
        StatisticsCalculation calculationS = new StatisticsCalculation(statisticsMock);
        List<String> users = new LinkedList<>();
        ForumUser user1 = new ForumUser("Adam", "Kowalski", "098765432123");
        Mockito.when(statisticsMock.userNames(user1)).then(users);
        int expectedValue = 5;

        //When
        StatisticsCalculation statistics1 = new StatisticsCalculation();

        //Then
        Assertions.assertEquals(expectedValue, statistics1);
    }
}
