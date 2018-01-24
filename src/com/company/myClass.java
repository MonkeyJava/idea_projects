package com.company;

import java.io.IOException;

/**
 * Created by Sveta on 29.01.2017.
 */
public class myClass {

    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("C:\\Windows\\notepad.exe");
        processBuilder.start();

    }


}
