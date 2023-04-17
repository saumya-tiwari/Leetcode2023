import java.util.Arrays;

class Swap{
    public static void main(String[] args) {
      int[] arr = new int[] {2,4,6,7,9};

      reverse(0, arr);

      System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int i, int[] arr){

        int n = arr.length;

        if(i >= (n/2))
          return;

        swap(i, n -i - 1, arr);
        reverse(i + 1, arr);

    }

    private static void swap(int i, int j, int[] arr) {
        int  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
