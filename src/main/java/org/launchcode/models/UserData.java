package org.launchcode.models;

import java.util.ArrayList;

/**
 * Created by ethan on 4/4/17.
 */
public class UserData {

    static ArrayList<User> users = new ArrayList<>();

    public static ArrayList<User> getAll() {
        return users;
    }

    public static void add(User newUser) {
        users.add(newUser);
    }

    public static User getById(int id) {

        User theUser = null;

        for (User candidateUser : users) {
            if (candidateUser.getUserId() == id) {
                theUser = candidateUser;
            }
        }

        return theUser;
    }
}
