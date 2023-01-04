package com.questions;

import java.util.Collections;

public class WaterArea {

    public static void main(String[] args) {
        int [] arr= {3,10,5,4,2,1,5,7,8,9,6,5,4,10};
        System.out.println("maxArea(arr) = " + maxArea(arr));
    }
    public static int maxArea(int [] height){

        //check negative scenarios
        if (height.length==2){
            return (Math.min(height[0],height[1])) * 1;

        }
        int  left=0;
        int right= height.length-1;
        int area=0;
        int max=0;

        while (left<=right){
            int width = right-left;
            area= Math.min( height[left],height[right]) * width;
            if (max<area){
                max=area;
            }
            if (height[left]>=height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}
