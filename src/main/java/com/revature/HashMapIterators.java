package com.revature;

import java.util.Iterator;
import java.util.Map;

public class HashMapIterators {

    public static void whileLooper(Map map) {
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry current = (Map.Entry) iterator.next();
            System.out.println(current.getKey() + ": " + current.getValue());
        }
    }

    public static void forLooper(Map map) {
        for(Object entry: map.entrySet()) {
            Map.Entry e = (Map.Entry) entry;
            int key = (int) e.getKey();
            String name = (String) e.getValue();
            System.out.println(key + ": " + name);
        }
    }

}
