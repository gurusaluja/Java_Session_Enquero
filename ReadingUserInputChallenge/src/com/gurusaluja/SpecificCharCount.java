package com.gurusaluja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class SpecificCharCount {
    HashMap<Character,Integer> doCharCount(String s)
    {
        int cn=0,val=0;
        char []arr = s.toCharArray();
        LinkedHashMap<Character,Integer> count = new LinkedHashMap<Character,Integer>();
        ArrayList<Character> list= new ArrayList<Character>();
        for(char c: arr){
            if(count.containsKey(c)) {
                val = count.get(c) + 1;
                if (val == 2) {
                    list.add(c);

                    //cn++;
                    //if(cn==2) {
                    //    System.out.println( c + " is 2 number who compeleted it's 2nd occurance in 2nd place");
                    //}
                }
                count.put(c, count.get(c) + 1);
            }
            else
                count.put(c,1);
        }
        cn=0;
        for(char c: list){
            if(count.get(c)==2){
                cn++;
                if(cn==2){
                    System.out.println( c + " is 2 number who compeleted it's 2nd occurance in 2nd place");
                    break;
                }
            }

        }
        return count;
    }
}
