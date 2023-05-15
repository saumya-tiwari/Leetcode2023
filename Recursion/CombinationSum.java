package Recursion;

import java.util.*;

public class CombinationSum{
  public static void main(String[] args) {
    List<List<Integer>> ans = new ArrayList<>();

    int[] arr = new int[]{2,3,6,7};

    findCombination(0,arr, ans, 7, new ArrayList<>());

    for(List<Integer> ls : ans){
       for(Integer i : ls){
        System.out.print(i +" ");
       }
       System.out.println("");
    }
  }

private static void findCombination(int index,int[] arr, List<List<Integer>> ans, int target, List<Integer> ls) {

    if(index == arr.length){
        if(target == 0){
            ans.add(new ArrayList<>(ls));
        }
        return;
    }

    if(arr[index] <= target){
        ls.add(arr[index]);
        findCombination(index, arr, ans , target- arr[index], ls);
        ls.remove(ls.size() - 1);
    }

    findCombination(index + 1, arr, ans, target, ls);
}
}