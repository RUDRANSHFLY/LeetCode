package Sorting.Insertion_Sort;

import java.util.Scanner;

public class insertsort {

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insert_sorto(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            int sm = i ;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[sm] > arr[j]){
                    sm = j ;
                }
                int t = arr[sm] ;
                arr[sm] = arr[i] ;
                arr[i] = t ;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("The Location Of Array Variable In Meomary"+arr);
        for(int i = 0 ; i < size ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("THE INPUT ARRAY:- ");
        printArray(arr);
        insert_sorto(arr);
        System.out.println("THE OUTPUT ARRAY IS :-");
        printArray(arr);
    }
}
