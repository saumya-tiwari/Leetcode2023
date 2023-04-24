package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class SubsequnceSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1};
        int sum = 2;
        int cnt = 0;
        
        System.out.println(printSubSum(0, new ArrayList<>(), 0, sum, arr, cnt));
    }

    private static int printSubSum(int index, ArrayList<Integer> list, int sum, int tsum, int[]arr, int cnt) {
        
        if(index >= arr.length){
            if(sum == tsum) 
            cnt += 1;
            //System.out.println(Arrays.toString(list.toArray()));
            return 1;
            
        }

        list.add(arr[index]);
        sum += arr[index];

        printSubSum(index + 1, list, sum, tsum, arr, cnt);

        list.remove(list.size() - 1);
        sum -= arr[index];

        printSubSum(index + 1, list, sum , tsum, arr, cnt);

        return -1;
    }
}
