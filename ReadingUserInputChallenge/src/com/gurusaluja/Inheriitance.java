package com.gurusaluja;

public class Inheriitance {
}

class A{
    A (){
        System.out.println("In a constructor of A");
    }
    private A(int ab){
        System.out.println("Private constructor");
    }
    {
        System.out.println("In a init of A");
    }
    static {
        System.out.println("In a static of A");
    }
}

class B extends A{
    B() {
        System.out.println("In a constructor of B");
    }
    {
        System.out.println("In as init of B");
    }
    static {
        System.out.println("In a static of B");
    }

}