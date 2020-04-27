package com.andychen.longestSubstringWithoutDups;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDups
{
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        int overallMax = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++)
        {
            if (!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                max ++;
                if (max > overallMax)
                {
                    overallMax = max;
                }
            }
            else
            {
                for (int j = start; j < i; j++)
                {
                    set.remove(s.charAt(j));
                    max--;
                    if (!set.contains(s.charAt(i)))
                    {
                        start = j+1;
                        break;
                    }
                }
                set.add(s.charAt(i));
                max ++;
            }
        }
        return overallMax;
    }

    public static void main(String[] args)
    {
        int result = lengthOfLongestSubstring("pwwkew");
        return;
    }
}
