package Warmup;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.security.*;
import java.text.*;

public class Birthday_Cake {
	static int birthdayCakeCandles(int[] a) {
        int ans=0;
        Arrays.parallelSort(a);
        int n=a.length;
        int tallest=a[n-1];
        for(int i=n-1;i>=0;i--){
            if(a[i]==tallest){
                ans++;
            }else{
                break;
            }
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
