import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get n1 and n2 input
        
        System.out.println("Enter n1");
        int n1 = sc.nextInt();
        
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        
        int a = n1;
        int b = n2;
        int gcd;
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        gcd = a;
        System.out.println("The GCD is:"+ gcd);
        
        
        
        
    }
}
