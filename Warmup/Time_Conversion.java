package Warmup;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.security.*;
import java.text.*;

public class Time_Conversion {
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         String meri = s.substring(8,s.length());
         int hr = Integer.parseInt(s.substring(0,2));
         String ans="";
         if(meri.equals("AM")){
             if(hr==12){
                 ans+="00";
                 ans+=s.substring(2,8);
             }else{
                 ans=s.substring(0,8);
             }
         }else{
             if(hr==12){
                 ans=s.substring(0,8);
             }else{
                 hr+=12;
                 ans+=hr;
                 ans+=s.substring(2,8);
             }
         }
         return ans;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }

}
