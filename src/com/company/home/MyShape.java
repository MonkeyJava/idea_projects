package com.company.home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sveta on 21.02.2017.
 */
public class MyShape {
    public static void main(String[] args) {
        List<Shape>  list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Square());
        list.add(new Shape());
        for (Shape s : list){
            System.out.println(s.draw());
        }

    }
    public static class Circle extends Shape {
        @Override
        public String draw() {
            return "Circle";
        }
    }
    public static class Square extends Shape {
        @Override
        public String draw() {
            return "Square";
        }
    }
    public static class Shape {
        public String draw(){
            return "Shape";
        }

    }
}
