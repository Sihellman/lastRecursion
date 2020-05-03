package edu.ti.caih313.recursion.hw;

public class Handshakes {

    public static int handshake(int n) {
        int shakes;

        if (n == 1) {
            shakes = 0;
        }
        if (n == 2) {
            shakes = 1;
        } else {
            shakes = (n - 1) + handshake(n - 1);
        }
        return shakes;
    }

    public static void main(String[] args) {
        System.out.println(handshake(4));
    }
}
