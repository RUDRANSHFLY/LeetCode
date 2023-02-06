import java.util.Scanner;

public class selectionsort {

    public static void selectsort(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            int sm = i ;
            for(int j = i + 1 ; j < arr.length  ; j++){
                if(arr[sm] > arr[j]){
                    sm = j ;
                }
            }
            int t = arr[i] ;
            arr[i] = arr[sm];
            arr[sm] = t ;
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for(int t = 0 ; t < size ; t++){
            arr[t] = s.nextInt();            
        }
        System.out.print("THE INPUT ARRAY :- ");
        printArray(arr);
        selectsort(arr);
        System.out.print("THE OUTPUT ARRAY:- ");
        printArray(arr);
    }    
}
