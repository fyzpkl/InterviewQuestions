package com.questions;

import java.util.*;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String text = "Hello world hello world world hello";
        System.out.println("repeat(text) = " + repeat(text));
    }
    public static String repeat(String text){
        String [] arr = text.split(" ");
        //Set <String> arrSet = new HashSet<>();
        Map <String, Integer> arrMap = new HashMap<>();

       // Collections.addAll(arrSet,arr);

        for (String s : arr) {
            if(!arrMap.containsKey(s)){
                arrMap.put(s,1);
            }else {
                arrMap.put(s,arrMap.get(s)+1);
            }
        }
        String key="";
        int max =0;
        for (Map.Entry<String, Integer> entry : arrMap.entrySet()) {
            if (entry.getValue()>max) {
                max= entry.getValue();
                key= entry.getKey();
            }
        }
        System.out.println(arrMap);

        return key;
    }
}
