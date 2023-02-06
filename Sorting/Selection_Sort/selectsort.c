#include<stdio.h>
#include<conio.h>

static void selectionSort(int arr[], int size){
    for(int i = 0 ; i < size ; i++){
        int sm = i ;
        for(int j = i + 1 ; j < size ; j++){
            if(arr[sm] > arr[j]){
                sm = j ;
            }
            int t = arr[i] ;
            arr[i] = arr[sm] ;
            arr[sm] = t ;
        }
    }
}


static void printArray(int arr[],int size){
    for(int j = 0 ; j < size ; j++ ){
        printf("%d ",arr[j]);
    }
    printf("\n");
}


int main(){
    // Selection sort in c language //
    int size ;
    printf("Please Enter Size of Array :- ");
    scanf("%d",&size);
    int arr[size] ; 
    for(int j = 0 ; j < size ; j++){
        int t ;
        scanf("%d",&t);
        arr[j] = t ; 
    }   

    printf("THE INPUT ARRAY :- ");
    printArray(arr,size);
    selectionSort(arr,size);
    printArray(arr,size);


    return 0 ; 
}