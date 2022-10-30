import java.io.*;
import java.math.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int count =0,max = 0;
        bufferedReader.close();
        while(n>0){
            int t = n%2;
            if(t==0)count=0;
            else {
                count++;
                max = Math.max(count,max);
            }
            n/=2;
        }
        System.out.println(max);
    }
}
