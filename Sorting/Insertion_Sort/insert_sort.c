#include <stdio.h>
#include <conio.h>

static void printArray(int arr[],int s){
    for(int i = 0 ; i < s ; i++){
        printf("%d " ,arr[i]);
    }
    printf("\n");
}

static void insert_sort(int arr[] , int s){
    for(int i = 1 ; i < s ; i++ ){
        int cur = arr[i] ;
        int j = i - 1 ;

        while (j >= 0 && arr[j] > cur)
        {
            /* code */
            arr[j+1] = arr[j] ;
            j--;
        }

        arr[j+1] = cur ;
        
    }
       
}


int main(){
    printf("Enter the size of Array :-");
    int size ; 
    scanf("%d",&size);
    int arr[size];
    for(int i = 0 ; i < size ; i++){
        int t ;
        scanf("%d",&t);
        arr[i] = t ;
    }
    printf("THE INPUT ARRAY : - ");
    printArray(arr,size);
    insert_sort(arr,size);
    printf("THE OUTPUT ARRAY :- ");
    printArray(arr,size);
    return 0 ;
}