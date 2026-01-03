import java.util.Scanner;

public class coding{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the largest number in the array is:");
        int largest = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
        sc.close();
    }
}
