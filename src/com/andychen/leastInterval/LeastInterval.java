package com.andychen.leastInterval;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeastInterval
{
    public int leastInterval(char[] tasks, int n) {
        Integer[] taskCounts = new Integer[26];
        Arrays.fill(taskCounts, 0);
        int totalTasks = 0;
        for (char task : tasks)
        {
            taskCounts[task - 'A'] ++;
            totalTasks ++;
        }
        List<Integer> list = Arrays.asList(taskCounts);
        Collections.sort(list, Collections.reverseOrder());
        int totalSteps = 0;
        while(totalTasks > 0)
        {
            int oneSweepTaskCounts = 0;
            Collections.sort(list, Collections.reverseOrder());
            for (int i = 0; i<list.size(); i ++)
            {
                Integer taskCount = list.get(i);
                if (taskCount > 0 && oneSweepTaskCounts < n + 1)
                {
                    list.set(i, taskCount-1);
                    totalTasks --;
                    oneSweepTaskCounts ++;
                    totalSteps ++;
                }
            }
            if (oneSweepTaskCounts < n + 1 && totalTasks > 0)
            {
                totalSteps += n + 1- oneSweepTaskCounts;
            }
        }
        return totalSteps;
    }
}
