package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(001, "Jan Kowalski", 2000, 6, 24, 'M', 100));
        theUserList.add(new ForumUser(002, "Maria Wisniewska", 1987, 7, 2, 'K', 10));
        theUserList.add(new ForumUser(003, "Bartosz Bartkowiak", 2010, 1, 25, 'M', 5));
        theUserList.add(new ForumUser(004, "Jan Nowak", 2003, 6, 24, 'M', 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);

    }
}

