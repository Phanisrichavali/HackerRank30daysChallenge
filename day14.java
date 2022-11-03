import java.util.Scanner;
import java.util.*;

class Difference {
    
    private int[] _elements;
    public int maximumDifference;
    
    Difference(int[] _elements) {
        this._elements = _elements;
    }
    
    public void computeDifference() {
        for (int i = 0; i < _elements.length; i++) {
            for (int j = i + 1; j < _elements.length; j++) {
                int diff = Math.abs(_elements[i] - _elements[j]);
                if (maximumDifference < diff) {
                    maximumDifference = diff;
                }
            }
        }
        System.out.println(maximumDifference);
    }
        
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] _elements = new int[N];
        for(int i = 0; i < _elements.length; i++) {
            _elements[i] = scanner.nextInt();
        }
        Difference d = new Difference(_elements);
        d.computeDifference();
    }
}
