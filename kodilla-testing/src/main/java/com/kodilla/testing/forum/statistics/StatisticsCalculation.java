package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class StatisticsCalculation {
    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double avPostsPerUser;
    private double avCommentsperUser;
    private double avCommentsPerPost;



    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (userCount > 0)
        avCommentsperUser = commentsCount / userCount;
        if (postsCount > 0)
            avCommentsPerPost = commentsCount / postsCount;
        if (userCount > 0)
        avPostsPerUser = postsCount / userCount;

    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsperUser() {
        return avCommentsperUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }
}



