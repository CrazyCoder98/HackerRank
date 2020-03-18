package Warmup;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.security.*;
import java.text.*;

public class Min_Max_Sum {
	static void miniMaxSum(int[] a) {
        long minS=0, maxS=0;
        Arrays.parallelSort(a);
        for(int i=0;i<4;i++){
            minS+=a[i];
        }
        for(int i=a.length-1;i>=a.length-4;i--){
            maxS+=a[i];
        }
        System.out.println(minS+" "+maxS);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
