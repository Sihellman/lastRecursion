package edu.ti.caih313.recursion.sort;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] anArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Array values before sorting:");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
        MergeSort.sort(anArray, "> ");
        System.out.println("Array values after sorting:");
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
        System.out.println("number of copies: " + MergeSort.getNumberOfCopies());
    }
}