package com.andychen.common;

public class IntPair
{
    public int a;
    public int b;
    public IntPair(int i, int j)
    {
        a = i;
        b = j;
    }

    @Override
    public boolean equals(Object o)
    {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof IntPair)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        IntPair c = (IntPair) o;

        // Compare the data members and return accordingly
        return this.a == c.a && this.b ==c.b;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + a;
        result = 31 * result + b;
        return result;
    }
}
