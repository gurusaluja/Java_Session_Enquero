package com.gurusaluja;

import java.util.HashMap;
import java.util.Set;

public class SpecificCharCount {
    HashMap<Character,Integer> doCharCount(String s)
    {
        int cn=0,val=0;
        char []arr = s.toCharArray();
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        for(char c: arr){
            if(count.containsKey(c)) {
                val = count.get(c) + 1;
                if (val == 2 && cn < 2) {
                    cn++;
                    if(cn==2) {
                        System.out.println( c + " is 2 number who compeleted it's 2nd occurance in 2nd place");
                    }
                }
                count.put(c, count.get(c) + 1);
            }
            else
                count.put(c,1);
        }
        return count;
    }
}
