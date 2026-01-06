import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:"); //121
        int num = sc.nextInt();
        int original = num;
        int palinum = 0;
        
  
        while(num > 0){
            int digit = num%10;
            palinum = palinum * 10 + digit;
            num = num/10;
  
        }
        System.out.print("The palindrome is: "+ palinum);
        
        if(original == palinum){
            System.out.println("\nIt is a palindrome");
        }
        else{
            System.out.println("\nIt's not a palindrome");
        }
        
        sc.close();
        
    }
}
