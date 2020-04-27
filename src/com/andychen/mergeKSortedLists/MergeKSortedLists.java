package com.andychen.mergeKSortedLists;

import java.util.HashSet;
import java.util.Set;

import com.andychen.common.ListNode;

public class MergeKSortedLists
{
    public static ListNode mergeKSortedLists(ListNode[] lists)
    {
        ListNode result = new ListNode();
        mergeKSortedListsHelper(lists, result);
        return result;
    }

    public static void mergeKSortedListsHelper(ListNode[] lists, ListNode current)
    {
        int minIndex = getMinIndex(lists);
        if (minIndex < 0)
        {
            return;
        }
        ListNode next = new ListNode();
        current.setVal(lists[minIndex].getVal());
        current.setNext(next);
        lists[minIndex] = lists[minIndex].getNext();
        mergeKSortedListsHelper(lists, next);
    }

    public static int getMinIndex(ListNode[] lists)
    {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < lists.length; i++ )
        {
            ListNode n = lists[i];
            if (n != null && n.getVal() < min)
            {
                min = n.getVal();
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args)
    {
        return;
    }
}
