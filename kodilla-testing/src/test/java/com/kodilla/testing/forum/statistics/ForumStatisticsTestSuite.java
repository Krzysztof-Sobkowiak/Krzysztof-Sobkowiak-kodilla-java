package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Test number #" + testCounter);
    }

    private List<String> generateListOfUsers( int usersNumber) {
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < usersNumber; i++) {
            usersNames.add("User Name");
        }
        return usersNames;
    }

    @Nested
    @DisplayName("Tests statistics for Posts")
    class TestsStatisticsForPosts {
        @Test
        void testStatisticsFor0Posts() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(1000);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(1000, forumStatistics.getNumberOfUsers());
            assertEquals(0, forumStatistics.getNumberOfPosts());
            assertEquals(0, forumStatistics.getNumberOfComments());
            assertEquals(0, forumStatistics.getAverageNumberOfPostsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost());
        }

        @Test
        void testStatisticsFor1000Posts() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(1000);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(1000);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(1000, forumStatistics.getNumberOfUsers());
            assertEquals(1000, forumStatistics.getNumberOfPosts());
            assertEquals(1, forumStatistics.getAverageNumberOfPostsPerUser());
        }
    }

    @Nested
    @DisplayName("Tests statistics for Comments")
    class TestsStatisticsForComments {
        @Test
        void testStatisticsFor0Comments() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(1000);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then

            assertEquals(1000, forumStatistics.getNumberOfUsers());
            assertEquals(1000, forumStatistics.getNumberOfPosts());
            assertEquals(0, forumStatistics.getNumberOfComments());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost());

        }

        @Test
        void testStatisticsForCommentsMoreThanPosts() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(1000);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(2000);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(1000, forumStatistics.getNumberOfUsers());
            assertEquals(1000, forumStatistics.getNumberOfPosts());
            assertEquals(2000, forumStatistics.getNumberOfComments());
            assertEquals(1, forumStatistics.getAverageNumberOfPostsPerUser());
            assertEquals(2, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(2, forumStatistics.getAverageNumberOfCommentsPerPost());

        }

        @Test
        void testStatisticsForCommentsLessThanPosts() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(1000);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(500);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(1000, forumStatistics.getNumberOfUsers());
            assertEquals(1000, forumStatistics.getNumberOfPosts());
            assertEquals(500, forumStatistics.getNumberOfComments());
            assertEquals(1, forumStatistics.getAverageNumberOfPostsPerUser());
            assertEquals(0.5, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(0.5, forumStatistics.getAverageNumberOfCommentsPerPost());

        }
    }

    @Nested
    @DisplayName("Tests statistics for Users")
    class TestsStatisticsForUsers {
        @Test
        void testStatisticsFor0Users() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(0, forumStatistics.getNumberOfUsers());
            assertEquals(0, forumStatistics.getNumberOfPosts());
            assertEquals(0, forumStatistics.getNumberOfComments());
            assertEquals(0, forumStatistics.getAverageNumberOfPostsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(0, forumStatistics.getAverageNumberOfCommentsPerPost());

        }

        @Test
        void testStatisticsFor100Users() {
            // Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(536);
            when(statisticsMock.commentsCount()).thenReturn(2665);

            // When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            // Then
            assertEquals(100, forumStatistics.getNumberOfUsers());
            assertEquals(536, forumStatistics.getNumberOfPosts());
            assertEquals(2665, forumStatistics.getNumberOfComments());
            assertEquals(5.36, forumStatistics.getAverageNumberOfPostsPerUser());
            assertEquals(26.65, forumStatistics.getAverageNumberOfCommentsPerUser());
            assertEquals(4.972014925373134, forumStatistics.getAverageNumberOfCommentsPerPost());

        }
    }
}
