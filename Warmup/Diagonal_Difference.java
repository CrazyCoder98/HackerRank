package Warmup;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.security.*;
import java.text.*;

public class Diagonal_Difference {
	public static int diagonalDifference(List<List<Integer>> a) {
	    // Write your code here
	        int d1=0, d2=0;
	        for(int i=0;i<a.size();i++){
	            d1+=a.get(i).get(i);
	            d2+=a.get(i).get(a.size()-1-i);
	        }
	        return Math.abs(d1-d2);
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, n).forEach(i -> {
	            try {
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        int result = diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }

}
