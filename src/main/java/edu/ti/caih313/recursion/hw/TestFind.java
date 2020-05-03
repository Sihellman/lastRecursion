package edu.ti.caih313.recursion.hw;

public class TestFind {
    public static void main(String[] args) {
        int[] array = {90, 191, 38, 1, 1238, 1, 123445, 999999};
        System.out.println(FindMax.findMax(array, 0, array.length-1));
        System.out.println(FindMax.findMax2(array, 0, array.length-1));
    }
}
