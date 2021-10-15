package com.revature;

public class StringRotationChecker {

    public static boolean rotationChecker(String s1, String s2) {
        if((s1 + s1).contains(s2)) {
            return true;
        }
        return false;
    }

}
