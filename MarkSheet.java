import java.util.*;
class MarkSheet{
public static void main ( String args []){

Scanner sc=new Scanner(System.in);
System.out.println("Enter your score in c++,Data stuctures and in operating systems");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double percnt= (a+b+c)*0.3333;
System.out.println(percnt + "%");
if(percnt>90){
    System.out.print(" your grade is A");
} 
else if(percnt>80){
    System.out.print("your grade is B");
}
else if (percnt>70){
    System.out.print("your grade is C");

}
else if(percnt>60){
    System.out.print("your grade is D");
}
else {
System.out.print("you are fail");
}
}

}
