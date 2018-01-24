package stepik.Test;

/**
 * Created by Sveta on 02.03.2017.
 */
public class MyMetodBool {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true,true,true,false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((!a) & (!b) & c & d) ^ (a & b & (!c) & (!d)) ^ (a & (!b) & (!c) & d) ^ ((!a) & b & c & (!d)) ^ (a & (!b) & c & (!d)) ^ ((!a) & b & (!c) & d);
    }
}

