package com.gurusaluja;

public class StringSplit {
    public String[] doSplit(String s){
        return s.split("\\s");
    }
    public int stringCount(String str){
        String []a =doSplit(str);
        return(a.length);
    }
}
