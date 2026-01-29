// min element of Array

import java.util.Scanner;
public class ArrayQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();     
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The min value is :" + min);
    }
}
