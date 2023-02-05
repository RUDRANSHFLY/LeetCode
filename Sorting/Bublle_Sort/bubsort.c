#include<stdio.h>
#include<conio.h>


static void bubbleSort(int arr[] ,int n){
    for(int i = 0 ; i < n - 1 ; i++){
        for(int j = 0 ; j < n- i - 1 ; j++){
            if(arr[j] > arr[j+1]){
                int t = arr[j+1];
                arr[j+1] = arr[j] ;
                arr[j] = t ;
            }
        }
    }
}

static void printArray(int arr[] , int n){
    for(int i = 0 ; i < n ; i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
}

int main(){
    printf("Bublle Sort\n");   
    // making an Array 
    int size ;
    scanf("%d",&size);
    int arr[size]; 
    printf("The size of Array %d \n",size);


    for(int i = 0 ; i < size ; i++){
       printf("Enter value for Array %d Position :- ",i);
       int t ;
       scanf("%d",&t);
       arr[i] = t ;
    }

    printf("The Input Array :- ");
    printArray(arr,size);
    printf("The Output Array :- ");
    bubbleSort(arr,size);
    printArray(arr,size);


    

    
    return 0 ;
}