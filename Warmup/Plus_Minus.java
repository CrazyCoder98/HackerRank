package Warmup;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.security.*;
import java.text.*;

public class Plus_Minus {
	
	static void plusMinus(int[] a) {
        int p=0, n=0, z=0;
        for(Integer i : a){
            if(i<0){
                n++;
            }else if(i>0){
                p++;
            }else{
                z++;
            }
        }
        int t=a.length;
        System.out.println(p*1.0/t);
        System.out.println(n*1.0/t);
        System.out.println(z*1.0/t);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
