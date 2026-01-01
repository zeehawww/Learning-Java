import java.util.Scanner;

class Solution{
    
    public static void main(String[] args){
        int digits = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 0){
            System.out.println(1);
            return;
        }
        while (n!=0){
        
            n = n/10;
            
        }
        System.out.println("digits: " + digits);
        

    }
}
