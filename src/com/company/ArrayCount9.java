package com.company;

/**
 * Created by ridita on 4/12/17.
 */
public class ArrayCount9 {

    public int arrayCount9(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;

    }

}
