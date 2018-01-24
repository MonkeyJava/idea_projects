package stepik.Test;

/**
 * Created by Sveta on 02.03.2017. Вычисляем високосный год.
 */
public class MyCalendar {
    public static void main(String[] args) {
        System.out.println(leapYearCount(2000));
        System.out.println(0x0bp3);
        System.out.println(flipBit(0, 1));
        char ch = 0x005C + 29;
        System.out.println(charExpression(29));
        System.out.println(isPowerOfTwo(30));
        System.out.println('A' + '1' + "2");
        System.out.println("A" + 12);
        System.out.println('A' + "12");
        System.out.println("A" + ('\t' + '\u0003'));

    }
    public static int leapYearCount(int year) {
        return year = year/4 - year/100 + year/400;
    }
    public static int flipBit(int value, int bitIndex) {
        return value^(1<<bitIndex-1);}
    public static char charExpression(int a) {
        return (char) (0x005C + a);
    }
    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value)) == 1) ? true  : false; // you implementation here
    }
}
