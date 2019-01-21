package com.kfr.youkuang;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Util {
    public static int getUserID(HttpServletRequest request) {
        final HttpSession session = request.getSession();
        final int userID = (int) session.getAttribute("userID");
        return userID;
    }

    public static String getNewTableName(int accountID, HttpServletRequest request) {
        return "UAT" + getUserID(request) + "_" + accountID;
    }

}

