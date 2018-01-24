package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {


        public static void main(String[] args) throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> arr = new ArrayList<>();
            DataInputStream data = new DataInputStream(new FileInputStream(reader.readLine()));
            reader.close();
            while (data.available() > 0)
            {
                try {
                    int n = Integer.parseInt(data.readLine());
                    if (n%2 == 0)
                        arr.add(n);
                    //System.out.println(n);
                    } catch (EOFException e){
                    System.out.println("Joppa");
                }
            }

            data.close();
            Collections.sort(arr);
            for (int x : arr)
                System.out.println(x);
        }

}
