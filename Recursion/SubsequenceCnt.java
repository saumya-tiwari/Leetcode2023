package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceCnt {
    
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,1};

        System.out.println(countSubsequence(0, new ArrayList<Integer>(),0, 3, arr ));
    }

    private static int countSubsequence(int i, ArrayList<Integer> arrayList, int j, int k, int[] arr) {

        if(i >= arr.length){
            if(j == k)
            return 1;
        else return 0;
        }

        arrayList.add(arr[i]);
        j += arr[i];
        int l = countSubsequence(i + 1, arrayList, j, k, arr);

        arrayList.remove(arrayList.size() - 1);
        j -= arr[i];
        

        int r = countSubsequence(i + 1, arrayList, j, k, arr);

        return l + r;
    }
}
