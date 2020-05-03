package edu.ti.caih313.recursion.hw;

import java.math.BigInteger;

public class Factorials {
    public static BigInteger findFactorial(BigInteger n){
        BigInteger factorial;
        if (n.equals(BigInteger.ZERO)){
            factorial = BigInteger.ONE;
        }
        else {
            factorial =  n.multiply( findFactorial(n.subtract(BigInteger.ONE)));
        }
        return factorial;
    }
}
