package com.andychen.seatArragements;

public class SeatArrangements
{
    public static int minOverallAwkwardness(int[] arr) {
        boolean changed = true;
        int preMinIndex = -1;
        int preMaxIndex = -1;
        int gmax = Integer.MAX_VALUE;
        while (changed)
        {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIndex = 0;
            int maxIndex = 0;
            for (int i = 0; i < arr.length; i++)
            {
                int awk = 0;
                if (i != 0 && i != arr.length - 1)
                {
                    awk = Math.max(Math.abs(arr[i] - arr[i-1]), Math.abs(arr[i] - arr[i+1]));
                }
                else if (i == 0)
                {
                    awk = Math.max(Math.abs(arr[i] - arr[arr.length - 1]), Math.abs(arr[i] - arr[i+1]));
                }
                else
                {
                    awk = Math.max(Math.abs(arr[i] - arr[i-1]), Math.abs(arr[i] - arr[0]));
                }

                if (awk < min)
                {
                    min = awk;
                    minIndex = i;
                }
                if (awk > max)
                {
                    max = awk;
                    maxIndex = i;
                }
                System.out.println("awk:" + awk + "minIndex:" + minIndex + "maxIndex:" + maxIndex);
            }
            if ( max < gmax)
            {
                int temp= arr[minIndex];
                arr[minIndex] = arr[maxIndex];
                arr[maxIndex] = temp;
                preMinIndex = minIndex;
                preMaxIndex = maxIndex;
                gmax = max;
                changed = true;
            }
            else
            {
                changed = false;
            }

        }
        return gmax;
    }

    public static void main(String[] args)
    {
        int out = minOverallAwkwardness(new int[]{1, 2, 5, 3, 7});
        return;
    }
}
