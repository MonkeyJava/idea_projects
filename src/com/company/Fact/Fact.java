package com.company.Fact;

import java.math.BigInteger;

/**
 * Created by Sveta on 04.04.2017.
 */
public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(1000));
    }
    public static BigInteger fact(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            result = (result.multiply(BigInteger.valueOf(i)));
        }
        return result;
    }
}
