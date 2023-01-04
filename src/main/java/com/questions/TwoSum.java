package com.questions;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};


        System.out.println("twoSum(arr,9) = " + twoSum(arr, 9));
    }
    public static int[] twoSum(int[] nums, int target) {
        int temp=nums[0];
        int [] arr = new int[2];
        boolean found= false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[i]+ nums[j] == target ){
                    System.out.println("Target");
                    arr[0]=i;
                    arr[1]=j;

                    found=true;
                    return arr;

                }
            } if(found){
                break;
            }

        }

        return null;
    }
}
