package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMainForumUser {
    public static void main(String[] args) {
        Forum forumUserList = new Forum();

        Map<Integer, ForumUser> forumUserMap = forumUserList.getList().stream()
                .filter(sexType -> sexType.getSex() == 'M')
                .filter(age -> age.getAge() >= 20)
                .filter(posts -> posts.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueID, sexType -> sexType));

        System.out.println("Number of map elements: " + forumUserMap.size());
        forumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}


