package com.andychen.balanceSplit;

import java.util.Arrays;

public class BalanceSplit
{
    public static boolean balancedSplitExists(int[] arr) {
        // Write your code here
        Arrays.sort(arr);
        int left = 0;
        int right = arr[arr.length - 1];
        int index = arr.length - 2;
        for (int i=0; i< arr.length - 1; i++)
        {
            left += arr[i];
        }
        if (left == right)
        {
            return true;
        }
        while(right < left && index > 0)
        {
            if (arr[index] != arr[index - 1])
            {
                left -= arr[index];
                right += arr[index];
                if (left == right)
                {
                    return true;
                }
                index --;
            }
            else
            {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        boolean out = balancedSplitExists(new int[]{2, 1, 2, 5});
        return;
    }
}
