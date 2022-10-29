
#include <stdio.h>
#include <stdlib.h>

int factorial(int n) {
if(n==1){
return 1;
}
else {    
return(n*factorial(n-1));}
}

int main()
{
    int n,result;
    scanf("%d",&n);
    result=factorial(n);
    printf("%d",result);
    return 0;
}
