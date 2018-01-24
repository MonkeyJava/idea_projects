package com.company;

/**
 * Created by Sveta on 09.02.2017.
 */
public class SumNumber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String str = Integer.toString(number); //напишите тут ваш код
        char[] ch = str.toCharArray();
        System.out.println(546%10);
        System.out.println(9%10);

        int sum = ch[0] + ch[1] + ch[2];
        return sum;
    }
}
