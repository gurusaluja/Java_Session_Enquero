package com.gurusaluja;

public class Overriding {
}

class AA{
    public int a=100;
    short b=100;
    private void fun() throws Exception{
        System.out.println("In a parent class");
    }
    public void fun1(){
        System.out.println("In a parent class");
    }
    public void parfun()
    {
        System.out.println("In a parent function");
    }
}
class BB extends AA{
    public int a=50;
    short b=50;
    public void fun(){
        System.out.println("In a child class");
    }
    public void fun1(){
        System.out.println("In a child class");
    }
    public void childfun()
    {
        System.out.println("In a child function");
    }
}
