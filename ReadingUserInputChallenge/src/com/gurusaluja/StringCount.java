package com.gurusaluja;

import java.util.HashMap;

public class StringCount {
    HashMap<String,Integer> doStringCount(String str){
        StringSplit obj = new StringSplit();
        String[] splitStr = obj.doSplit(str);
        HashMap<String,Integer> count = new HashMap<String, Integer>();
        for(String s:splitStr){
            if(count.containsKey(s)){
                count.put(s,count.get(s)+1);
            }else
                count.put(s,1);
        }
        return count;
    }
}
