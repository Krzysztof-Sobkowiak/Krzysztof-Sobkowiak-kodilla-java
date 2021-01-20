package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public ForumStatistics( Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers == 0){
            averageNumberOfPostsPerUser = 0;
        } else {
            averageNumberOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
        }
        if (numberOfPosts == 0){
            averageNumberOfPostsPerUser = 0;
        } else {
            averageNumberOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
        }
        if (numberOfComments == 0){
            averageNumberOfCommentsPerPost = 0;
        } else {
            averageNumberOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Number of Users: " + numberOfUsers);
        System.out.println("Number of Posts: " + numberOfPosts);
        System.out.println("Number of Comments: " + numberOfComments);
        System.out.println("Average number of Posts per User: " + averageNumberOfPostsPerUser);
        System.out.println("Average number of Comments per User: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of Comments per Post: " + averageNumberOfCommentsPerPost);

    }
}
