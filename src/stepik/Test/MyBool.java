package stepik.Test;

/**
 * Created by Sveta on 02.03.2017.
 */
public class MyBool {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        System.out.println((a&b) + " and " + (a==b));

        System.out.println((a^b) + " and " + (a!=b));

        System.out.println((a|b) + " and " + (a||b));

        System.out.println((a|b) + " and " + (a!=b));

    }
}
/** a and b = true
 *true and true
 false and false
 true and true
 true and false

    a and b = false
 false and true
 false and false
 false and false
 false and false

     a = true b = false
 false and false
 true and true
 true and true
 true and true
 *
 * */