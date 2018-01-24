package com.company;

/**
 Класс реализует калькулятор.
 */
public class Calculator {
    /**
     Результат вычисления.
     */
    private int result;
    /**
     Суммируем аргументы.
     @ first second Аргументы суммирования.
     */
    public void add(int first, int second){

        this.result = first + second;
    }
    /**Вычитаем аргументы.
     @first second Аргументы вычитания.
     */
    public void subtract(int first, int second){

        this.result = first - second;
    }
    /**Умножаем аргументы.
     @first second Аргументы умножения.
     */
    public void multiplication (int first, int second){

        this.result = first * second;
    }
    /**Делим аргументы.
     @first second Аргументы деления.
     */
    public void division(int first, int second){

        this.result = first / second;

    }
    /**
     Получить результат.
     @return результат вычисления.
     */
    public int getResult(){
        return this.result;
    }
    /**
     Очистить результат вычисления.
     */
    public void cleanResult(){
        this.result = 0;
    }
}