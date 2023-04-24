package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceCnt {
    
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,1};

        System.out.println(countSubsequence(0,0, 3, arr ));
    }

    private static int countSubsequence(int i, int j, int k, int[] arr) {

        if(i >= arr.length){
            if(j == k)
            return 1;
        else return 0;
        }

        j += arr[i];
        int l = countSubsequence(i + 1, j, k, arr);

        j -= arr[i];
        

        int r = countSubsequence(i + 1, j, k, arr);

        return l + r;
    }
}
