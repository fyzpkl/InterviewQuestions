package com.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapMaxValue {
    public static void main(String[] args) {
        Map<String, Integer> mapObj = new HashMap<>();

        mapObj.put("A",1000);
        mapObj.put("B",400);
        mapObj.put("C",200);
        mapObj.put("D",700);
        mapObj.put("G",300);
        mapObj.put("H",500);

        String key="";
        int value=0;

        for (Map.Entry<String, Integer> stringIntegerEntry : mapObj.entrySet()) {
            if (stringIntegerEntry.getValue()>value){
                value = stringIntegerEntry.getValue();
                key = stringIntegerEntry.getKey();
            }
        }

        System.out.println(key + " = " + value);
    }
}
