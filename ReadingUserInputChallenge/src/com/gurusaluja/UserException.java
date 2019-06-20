package com.gurusaluja;

import java.text.NumberFormat;

public class UserException {
    int addNumber(int... a) throws RuntimeException {
        int sum=0;
        for(int i = 0; i< a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
}

class UserDefineException extends java.lang.Exception{
    UserDefineException(){
        super("User Define Exception");
    }
}