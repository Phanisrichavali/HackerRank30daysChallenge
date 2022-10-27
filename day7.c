#include <stdio.h>
#include <stdlib.h>
int main(){
    int n,a[10000];
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(int j=n-1;j>=0;--j){
        printf("%d ",a[j]);
    }
    return 0;
}
