package Recursion;

public class Fibonnaci {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.print(fibonnaci(i) + " ");
        }
       
    }

    static int fibonnaci(int n){
       
        if(n <= 1){
            return n;
        }

        return fibonnaci(n - 1) +fibonnaci( n - 2);

    }
}
