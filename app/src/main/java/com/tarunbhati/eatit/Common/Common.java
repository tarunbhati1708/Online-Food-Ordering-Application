package com.tarunbhati.eatit.Common;

import com.tarunbhati.eatit.Model.User;

public class Common {
    public static User currentUser;

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        Common.currentUser = currentUser;
    }
}
