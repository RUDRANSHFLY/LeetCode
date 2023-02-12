#include <stdio.h>
#include <conio.h>

static void printArray(int arr[],int s){
    for(int i = 0 ; i < s ; i++){
        printf("%d " ,arr[i]);
    }
    printf("\n");
}

static void insert_sort(int arr[] , int s){
    for(int i = 0 ; i < s - 1 ; i++ ){
        int sm = i ;
        for(int j = i + 1 ; j < s ; j++){
            if(arr[sm] > arr[j]){
                sm = j ;
            }
        }
        int t = arr[sm] ;
        arr[sm] = arr[i];
        arr[i] = t ; 
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