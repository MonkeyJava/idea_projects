package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by Sveta on 20.02.2017.
 */
public class MyNewClass {

        private ArrayList<Integer> list;
        public void write(int data)
        {
            list.add(data);
        }
        public int read()
        {
            int first = list.get(0); //Не рабочий код
            list.remove(0);
            return first;
        }

        public int available()
        {
            return list.size();
        }

    public static void main(String[] args) throws IOException {
        MyNewClass myObject = new MyNewClass();
        OutputStream outStream = new FileOutputStream("c:/my-object-data.txt");

        while (myObject.available() > 0)
        {
            int data = myObject.read(); //читаем один int из потока для чтения
            outStream.write(data); //записываем прочитанный int в другой поток.
        }

        outStream.close();
    }
 }

