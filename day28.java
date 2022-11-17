import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String[] names = new String[N];
        int a = 0;
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];

            String check[] = emailID.split("@", 2);
            if (check[1].equals("gmail.com")) {
                names[a] = firstName;
                a++;
            }
        }
        bufferedReader.close();
        for (int i = 0; i < N - 1; ++i) {
            for (int j = i + 1; j < N; ++j) {
                if (names[j] != null) {
                    if (names[i].compareTo(names[j]) > 0) {
                        String temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }
        }
        for (String s : names) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
