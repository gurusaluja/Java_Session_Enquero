package com.gurusaluja;

import java.util.HashMap;

public class CharCount {
    HashMap<Character,Integer> doCharCount(String s)
    {
        char []arr = s.toCharArray();
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        for(char c: arr){
            if(count.containsKey(c))

                count.put(c,count.get(c)+1);
            else
                count.put(c,1);
        }
        return count;
    }
}
