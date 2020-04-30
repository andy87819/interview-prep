package com.andychen.orangeRotting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.andychen.common.IntPair;

public class OrangeRotting
{
    public static int orangesRotting(int[][] grid) {
        Set<IntPair> goodones = new HashSet<>();
        Queue<IntPair> badones = new LinkedList<>();
        for (int i = 0; i< grid.length; i++)
        {
            for (int j= 0; j<grid.length; j++)
            {
                if (grid[i][j] == 1)
                {
                    goodones.add(new IntPair(i,j));
                }
                else if (grid[i][j] == 2)
                {
                    badones.add(new IntPair(i,j));
                }
            }
        }
        int minutes = 0;
        while(!goodones.isEmpty())
        {
            boolean infected = false;
            while(!badones.isEmpty())
            {
                IntPair bad = badones.poll();
                infected = infected || infect(bad.a - 1, bad.b, goodones, badones);
                infected = infected || infect(bad.a, bad.b - 1, goodones, badones);
                infected = infected || infect(bad.a + 1, bad.b, goodones, badones);
                infected = infected || infect(bad.a, bad.b + 1, goodones, badones);
                if (!infected)
                {
                    return -1;
                }
            }
            minutes ++;
        }
        return minutes;
    }

    public static boolean infect(int i, int j, Set<IntPair> goodones, Queue<IntPair> badones)
    {
        IntPair a = new IntPair(i,j);
        if (goodones.contains(a))
        {
            goodones.remove(a);
            badones.add(a);
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[][] grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        int minutes = orangesRotting(grid);
        return;
    }
}
