package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Anna";
        boolean isPalindrome = checkPalindrome(0, str);
        System.out.println(isPalindrome);
    }

    static boolean checkPalindrome(int i , String str){

        if(str.isEmpty())
          return false;

        if(i >= str.length())
           return true;

        if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - i - 1)))
           return false;

        return checkPalindrome(i + 1, str);

    }
}
