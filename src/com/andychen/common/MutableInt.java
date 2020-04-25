package com.andychen.common;

public class MutableInt
{
    private int val;

    public MutableInt(int v)
    {
        val = v;
    }

    public void increment()
    {
        val ++;
    }

    public int getVal()
    {
        return val;
    }

    public void add(int v)
    {
        val += v;
    }

    public void substract(int v)
    {
        val -= v;
    }

    public void decrement()
    {
        val --;
    }
}
