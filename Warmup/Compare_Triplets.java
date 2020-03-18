package Warmup;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.security.*;
import java.text.*;

public class Compare_Triplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ans=new ArrayList<>();
        ans.add(0);
        ans.add(0);
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                ans.set(0,ans.get(0)+1);
            }else if(a.get(i)<b.get(i)){
                ans.set(1,ans.get(1)+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
