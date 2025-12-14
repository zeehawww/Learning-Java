import java.util.Scanner;
class Computer{
    String name;
    String reg_no;
    Computer(String user){
        this.username=user;
    }
    public void poweron(){
        System.out.println("Computer with username:"+this.username+" power on");
    }
}
class digisum{
    public static void main (String[] args){
        Computer obj1=new Computer("Logu");
        Computer obj2=new Computer("SRM");
        obj1.poweron();
        obj2.poweron();
    }
  
}
