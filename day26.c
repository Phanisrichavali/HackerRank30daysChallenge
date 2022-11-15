#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
typedef struct date {
    int day;
    int month;
    int year;
} Date;

int main()
{
    Date returnDate = { 0 };
    Date expectedDate = { 0 };
    
    scanf("%d %d %d", &returnDate.day, &returnDate.month, & returnDate.year);          scanf("\n");
    scanf("%d %d %d", &expectedDate.day, &expectedDate.month, & expectedDate.year);
    
    if (returnDate.year > expectedDate.year) {
        printf("10000\n");
        return 0;
    }
    
    if (returnDate.month > expectedDate.month && returnDate.year == expectedDate.year) {
        printf("%d\n", 500 * (returnDate.month - expectedDate.month ));
        return 0;
    }
    
     if (returnDate.day > expectedDate.day &&
         returnDate.month == expectedDate.month &&
         returnDate.year == expectedDate.year) {
             
        printf("%d\n", 15 * (returnDate.day - expectedDate.day ));
        return 0;
    }
 
    printf("0\n");
 
    return 0;
}
