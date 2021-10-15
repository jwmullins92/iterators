package com.revature;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Sally");
        students.put(3, "Don");
        students.put(4, "Wallace");
        students.put(5, "Leah");
        HashMapIterators.whileLooper(students);
        System.out.println("");
        HashMapIterators.forLooper(students);
        System.out.println("");

        System.out.println(StringRotationChecker.rotationChecker("jared", "redja"));
        System.out.println(StringRotationChecker.rotationChecker("abcde", "bdacd"));


    }


}
