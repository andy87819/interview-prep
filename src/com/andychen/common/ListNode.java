package com.andychen.common;

import java.util.List;

public class ListNode
{
    private int val;
    private ListNode next;

    public ListNode()
    {

    }

    public ListNode(int l)
    {
        val = l;
    }

    public void setNext(ListNode next)
    {
        this.next = next;
    }

    public ListNode getNext()
    {
        return next;
    }

    public int getVal()
    {
        return val;
    }

    public void setVal(int val)
    {
        this.val = val;
    }
}
