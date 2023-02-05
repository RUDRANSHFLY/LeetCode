package Sorting.Bublle_Sort;

import java.util.Scanner;

public class bublesort {

    public static void bubblesort(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
          for(int j = 0 ; j < arr.length - i - 1 ; j++){
            if(arr[j] > arr[j+1]){
                int t = arr[j+1] ;
                arr[j+1] = arr[j] ;
                arr[j] = t ;
            }
          }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int si = s.nextInt();
        int[] arr = new int[si];

        for(int i = 0 ; i < si ; i++ ){
            arr[i] = s.nextInt() ;
        }

       bubblesort(arr);

        for(int j = 0 ; j < si ; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
