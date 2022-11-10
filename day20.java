public class Solution{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int a[]=new int[n];
    for(int i=0; i<n; i++){
        a[i]=sc.nextInt(); 
    }                                                    
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
               count++;
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
            }
        }
        }
    for(int i=0;i<a.length;i++){
System.out.println("Array is sorted in "+count+" swaps.");
 System.out.println("First Element: "+a[i]);
 System.out.println("Last Element: "+a[n-1]);
 break;
} } }
