package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequenceOnlyone {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,1};

        getSubsequence(0, new ArrayList<Integer>(),0,2,arr );
    }

    private static boolean getSubsequence(int i, ArrayList<Integer> list, int sum, int tsum, int[] arr) {

        if(i >= arr.length){
            if(sum == tsum){
                System.out.println(Arrays.toString(list.toArray()));
                return true;
            }else
            return false;
               
        }

        list.add(arr[i]);
        sum += arr[i];

        if(getSubsequence(i + 1, list, sum, tsum, arr) == true) return true;

        list.remove(list.size() - 1);
        sum -= arr[i];

        if(getSubsequence(i + 1, list, sum, tsum, arr)== true) return true;

        return false;


    }
}
