#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
 void even(char s[10000]){
     
     int length = strlen(s);
        for (int i=0 ; i<length ; i++){
            if(i%2==0){
                 printf("%c" , s[i]);
            }
        }
    }  
    
    void odd(char s[10000]){
         int length=strlen(s);
        
        for (int i =0 ; i<length ; i++){
        if(i%2!=0){
            printf("%c" , s[i]);
            
        }
        }
    }
    
    
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n ;
    scanf("%d",&n);
    for (int i=1 ; i<=n ; i++){
    char s[10000];
    scanf("%s",s); 
    even(s);
    printf(" ");
    odd(s);
    printf("\n"); 
    }
   
    return 0;
    
}
