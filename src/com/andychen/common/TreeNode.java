package com.andychen.common;

public class TreeNode<T>
{
    public TreeNode()
    {

    }
    private T val;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public void setVal(T v)
    {
        val = v;
    }

    public void setLeft(TreeNode<T> l)
    {
        left = l;
    }

    public void setRight(TreeNode<T> r)
    {
        right = r;
    }

    public T getVal()
    {
        return val;
    }

    public TreeNode<T> getLeft()
    {
        return left;
    }

    public TreeNode<T> getRight()
    {
        return right;
    }
}
