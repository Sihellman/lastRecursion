package edu.ti.caih313.recursion.sort;

/**
 * Class for sorting an array of integers from smallest to largest
 * using the merge sort algorithm.
 */
public class MergeSort {
    /**
     * Precondition: Every indexed variable of the array a has a value.
     * Postcondition: a[0] <= a[1] <= ... <= a[a.length - 1].
     */
    private static int numberOfCopies = 0;
    public static void sort(int[] a, String prefix) {
        //if a.length == 1, a is sorted.
        System.out.println(prefix + "entering sort, a:"+ a.length);
        if (a.length >= 2) {
            int halfLength = a.length / 2;
            int[] firstHalf = new int[halfLength];
            int[] lastHalf = new int[a.length - halfLength];
            System.out.println(prefix + "before divide, a:"+ a.length + " firstHalf:" + firstHalf.length + " lastHalf:" + lastHalf.length);
            divide(a, firstHalf, lastHalf, "-" + prefix);
            System.out.println(prefix + "before sort, a:"+ a.length + " firstHalf:" + firstHalf.length);
            sort(firstHalf, "-" + prefix);
            System.out.println(prefix + "before sort, a:"+ a.length +" lastHalf:" + lastHalf.length);
            sort(lastHalf, "-" + prefix);
            System.out.println(prefix + "before merge, a:"+ a.length + " firstHalf:" + firstHalf.length + " lastHalf:" + lastHalf.length);
            merge(a, firstHalf, lastHalf, "-" + prefix);
        }
        System.out.println(prefix + "leaving sort, a:"+ a.length);
    }

    //Precondition: a.length = firstHalf.length + lastHalf.length.
    //Postcondition: All the elements of a are divided
    //between the arrays firstHalf and lastHalf.
    private static void divide(int[] a, int[] firstHalf,
                               int[] lastHalf, String prefix) {
        System.out.println(prefix + "entering divide, a:"+ a.length + " firstHalf:" + firstHalf.length + " lastHalf:" + lastHalf.length);
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = a[i];
            numberOfCopies++;
        }


        for (int i = 0; i < lastHalf.length; i++) {
            lastHalf[i] = a[firstHalf.length + i];
            numberOfCopies++;
        }

        System.out.println(prefix + firstHalf.length + " elements in firstHalf, " + lastHalf.length + " elements in lastHalf");

        System.out.println(prefix + "leaving divide, a:"+ a.length + " firstHalf:" + firstHalf.length + " lastHalf:" + lastHalf.length);
    }

    //Precondition: Arrays firstHalf and lastHalf are sorted from
    //smallest to largest; a.length = firstHalf.length +
    //lastHalf.length.
    //Postcondition: Array a contains all the values from firstHalf
    //and lastHalf and is sorted from smallest to largest.
    private static void merge(int[] a, int[] firstHalf,
                              int[] lastHalf, String prefix) {
        System.out.println(prefix + "entering merge, a:"+ a.length + " firstHalf:" + firstHalf.length + " lastHalf:" + lastHalf.length);
        int firstHalfIndex = 0, lastHalfIndex = 0, aIndex = 0;
        while ((firstHalfIndex < firstHalf.length) &&
                (lastHalfIndex < lastHalf.length)) {
            if (firstHalf[firstHalfIndex] < lastHalf[lastHalfIndex]) {
                numberOfCopies++;
                a[aIndex] = firstHalf[firstHalfIndex];
                firstHalfIndex++;
            } else {
                numberOfCopies++;
                a[aIndex] = lastHalf[lastHalfIndex];
                lastHalfIndex++;
            }
            aIndex++;
        }
        //At least one of firstHalf and lastHalf has been
        //completely copied to a.
        //Copy rest of firstHalf, if any.
        while (firstHalfIndex < firstHalf.length) {
            numberOfCopies++;
            a[aIndex] = firstHalf[firstHalfIndex];
            aIndex++;
            firstHalfIndex++;
        }
        //Copy rest of lastHalf, if any.
        while (lastHalfIndex < lastHalf.length) {
            numberOfCopies++;
            a[aIndex] = lastHalf[lastHalfIndex];
            aIndex++;
            lastHalfIndex++;
        }

        System.out.println(prefix + (firstHalf.length + lastHalf.length) + " elements are being appended");
        System.out.println(prefix + (firstHalf.length + lastHalf.length + a.length) + "elements are being merged");
        System.out.println(prefix + "leaving merge, a:"+ a.length + " firstHalf:" + firstHalf.length + " lastHalf:" + lastHalf.length);
    }
    public static int getNumberOfCopies(){
        return numberOfCopies;
     }
}