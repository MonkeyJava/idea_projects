package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by Sveta on 29.01.2017.
 */
public class MyFile {

    public static void main(String[] args) throws IOException {
        File myFile = new File("C:\\");
        File file2 = new File("C:\\file.txt");
        file2.createNewFile();
        String[] s = myFile.list();

        for (File file : myFile.listFiles())
        {System.out.println(file);}
        Path userbin = Paths.get("C:\\");
        Path userbin2 = Paths.get("http://javarush.ru/course.html?v=8");

        System.out.println(userbin2);
    }

}
