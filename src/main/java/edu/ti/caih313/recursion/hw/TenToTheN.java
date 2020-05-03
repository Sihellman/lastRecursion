
package edu.ti.caih313.recursion.hw;

import java.math.BigInteger;
import java.util.Scanner;

public class TenToTheN {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        boolean fraction = false;
        if (number < 0) {
            number = -1 * number;
            fraction = true;
        }

        BigInteger tenToNum = tenToTheN(number);


        System.out.println("10^" + number + " =" + ((fraction) ? " 1/" : " ") + formatBigInteger(tenToNum, ""));
    }

    static BigInteger tenToTheN(int n) {
        BigInteger val;
        if (n == 0) {
            val = BigInteger.ONE;
        } else if (n == 1) {
            val = BigInteger.TEN;
        } else {
            BigInteger valHalf = tenToTheN(n / 2);
            val = valHalf.multiply(valHalf);
            if (n % 2 == 1) {
                val = val.multiply(BigInteger.TEN);
            }
        }
        return val;
    }
    static BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);
    static String formatBigInteger(BigInteger val, String suffix){
        String formattedNumber = (val.compareTo(ONE_THOUSAND) < 0)?
                (val.toString() + suffix)
                : (formatBigInteger(val.divide(ONE_THOUSAND), ",000" + suffix));
        return formattedNumber;

    }

/* static String recursiveFormatBigInteger(String stringN, int i, String copyStringN, int count){



         int f = stringN.length();
         char[] array = new char[f];
         if (i > -1 ){
             array[i] = copyStringN.charAt(i);
             if (count == 3){
                 count = 0;
                 stringN = "," + stringN;
             }
             count++;
             recursiveFormatBigInteger(array[i] + stringN, i-1, copyStringN, count+1);
         }
         return stringN;




    */
}



