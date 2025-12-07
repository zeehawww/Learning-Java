import java.util.Scanner;

class coder {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        for(int num=num1;num>=2;num--){
            int count=0;
            for(int i = 2; i<num;i++){
                if(num%i==0){
                    count++;
                    break;                                                                                                   
                }
            }
            if(count == 0){
                System.out.println(num);
            }
        }
    
        sc.close();
    }
}
