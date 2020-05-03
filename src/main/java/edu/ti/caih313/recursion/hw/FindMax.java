package edu.ti.caih313.recursion.hw;

public class FindMax {


    public static int findMax(int[] array, int startIndex, int endIndex){
        int retval;
        if (startIndex == endIndex) {
            retval = array[startIndex];
        } else if (startIndex == endIndex - 1) {
            if (array[startIndex] > array[endIndex]) {
                retval = array[startIndex];
            } else {
                retval = array[endIndex];
            }
        }else{
            int mid = (startIndex + endIndex) /2;
            int a = findMax(array, startIndex, mid);
            int b = findMax(array, mid + 1, endIndex);
            retval = Math.max(a, b);
        }
        return retval;
    }
    //the way that looks easier
    public static int findMax2(int[] array, int startIndex, int endIndex){
        int retval = 0;
        if (array[startIndex] < array[endIndex]){
            retval = array[endIndex];
            findMax2(array, startIndex+1, endIndex);
        }
        else if(array[startIndex] == array[endIndex]){
            retval = array[startIndex];
        }
        else{
            findMax2(array, startIndex, endIndex-1);
        }
        return retval;
    }
}
