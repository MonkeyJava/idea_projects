package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by Sveta on 05.02.2017.
 */
public class MyStream {

    public static void main(String[] args) throws IOException {


        String text = "ABCDEF";
        long startTime, stopTime;

        BufferedWriter w = new BufferedWriter(new FileWriter("C:\\file1.txt"));
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            w.write(text);
        }
        w.close();
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime); // 1

        FileWriter w1 = new FileWriter("C:\\file1.txt");
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            w1.write(text);
        }
        w1.close();
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime); // 2

    }
}
