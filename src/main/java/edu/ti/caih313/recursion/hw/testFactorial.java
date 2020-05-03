package edu.ti.caih313.recursion.hw;



import java.math.BigInteger;
import java.util.Scanner;



public class testFactorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("enter number, or 1 to stop");
            BigInteger n = keyboard.nextBigInteger();
            BigInteger sentinel = BigInteger.ONE;
            if(n.equals(BigInteger.ONE)){
                System.exit(0);
            }
            System.out.println("factorial: " + Factorials.findFactorial(n));
        }
    }//int stopped working after 12
    //long stopped after 20
}
