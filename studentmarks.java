import java.util.Scanner;
class Student{                                         //this is a class for student details
    String name,regno;
    int m1,m2,m3;
    Student(String name, String regno, int m1, int m2, int m3){
        this.name=name;
        this.regno=regno;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    Avg calculateAvg(){                             //method to calculate average marks
        Avg a1=new Avg();
        a1.average=(m1+m2+m3)/3.0;
        return a1;
    }                                           
    public void avgMarks(){                         //method to display average marks
        System.out.println("Average marks of "+name+" is: "+calculateAvg().average);
    }
}
class Avg {                                         //class to hold average marks
    double average;
}
class coder{                                        //class for main function aka main class
    public static void main (String[] args){
        System.out.println("Enter name:");
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Enter regno:");
        String regno= sc.nextLine();
        System.out.println("Enter marks of 3 subjects:");
        int m1= sc.nextInt();
        int m2= sc.nextInt();
        int m3=sc.nextInt();
        Student s1=new Student(name,regno,m1,m2,m3);
        s1.avgMarks();

    }
  
}
