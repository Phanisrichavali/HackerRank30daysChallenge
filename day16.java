import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        
        try {
            Integer integerValue = Integer.parseInt(S);
            System.out.println(integerValue);
        } catch(NumberFormatException exception) {
            System.out.println("Bad String");
        }
        
    }
}
