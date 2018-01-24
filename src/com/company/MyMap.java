package com.company;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MyMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Tuzov", "Oleg");
        map.put("novopashin", "Vasiliy");
        map.put("ivanov", "Vasiliy");
        map.put("petrov", "Ivan");
        map.put("Sidorov", "Vasiliy");
        map.put("Sid", "sereja");
        map.put("Svets", "sereja");
        Map<String, String> map2 = new HashMap<String, String>(map);
        Map<String, String> map3 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair1 : map2.entrySet()){
            int count = 0;
            for (Map.Entry<String, String> pair2 : map3.entrySet()){
                if (pair1.getValue().equals(pair2.getValue()))
                    count++;
            }
            if (count > 1) map.remove(pair1.getKey());
        }

        System.out.println(map);
        System.out.println(map2);
        System.out.println(map3);
        String str = "шалш";

            StringBuilder strBuilder = new StringBuilder(str);
            strBuilder.reverse();
        System.out.println( strBuilder.toString().equals(str));
        Date date = new Date("JULY 27 1979");
        //date.setMonth(5);
        System.out.println(date.getMonth());
    }

}
/*while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();
            while (it.hasNext()) {
                Map.Entry<String, String> p = it.next();
                if (pair.getValue().equals(p.getValue())) it.remove();*/