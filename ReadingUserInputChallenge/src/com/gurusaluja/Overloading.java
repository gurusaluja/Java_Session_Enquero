package com.gurusaluja;

public class Overloading {
    public void add()
    {
        System.out.println("Simple add function");
    }
    public int add(int a)
    {
        System.out.println("1 parameter with value of a " + a);
        return a;
    }
    public int add(int a, int b)
    {
        System.out.println("2 parameter with value of a "+ a + "and value of b " + b);
        return a+b;
    }

    public float add(float a, float b)
    {
        System.out.println("2 parameter with value of a "+ a + "and value of b " + b);
        return a+b;
    }
    protected int add(int... a)
    {
        System.out.println("Number of argument is " + a.length);
        return a[a.length - 1];
    }
    protected int add(int a, float... b)
    {
        System.out.println("number of argument is " + b.length+1);
        return (int)b[b.length-1];
    }

}

