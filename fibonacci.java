import java.util.Scanner;
class digisum{

    public static void main(String[] args) {
      int num1=0;
      int num2=1;
      int count=0;
      while(count<10){
        System.out.println(num1);
        int temp=num1;
        num1=num2;
        num2+=temp;
        count++;
      }
    }
}
