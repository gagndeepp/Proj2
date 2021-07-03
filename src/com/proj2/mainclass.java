package com.proj2;

import java.util.*;

public class mainclass {

    public static void main(String[] args) {

        String s = new String("He He is a good person but what if but what if a person good");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(s.split(" ")));

        Map<String, Integer> map = new HashMap<>();
        for(String str: list){
            if(map.get(str) == null){
                map.put(str,1);
            }
            else{
                map.put(str,map.get(str)+1);
            }
        }

        System.out.println(map);

    }

}
