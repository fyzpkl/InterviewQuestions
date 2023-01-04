package com.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EfficientJanitor {
    public static void main(String[] args) {
        List<Float> arrList = new ArrayList<>();
        arrList.add((float) 2.3);
        arrList.add((float) 1.3);
        arrList.add((float) 2.4);
        arrList.add((float) 2.7);
        arrList.add((float) 1.3);
        System.out.println("janitor(arrList) = " + janitor(arrList));

    }

    public static int janitor(List<Float> weights){

        Collections.sort(weights);
        System.out.println("weights = " + weights);

        int left=0;
        int right = weights.size()-1;
        int count=0;
        while (left<=right){
            if (weights.get(left) + weights.get(right)<=3.0f){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}
