package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2};

        printSubsequence(0, new ArrayList<Integer>(), arr.length, arr);
    }

    private static void printSubsequence(int index, ArrayList<Integer> list, int n, int[] arr) {
        if(index == n){
             System.out.println(Arrays.toString(list.toArray())); 
           return;
        }

        list.add(arr[index]);
        printSubsequence(index + 1, list, n, arr);

        list.remove(list.size() - 1);
        printSubsequence(index + 1, list, n, arr);
    }
}
