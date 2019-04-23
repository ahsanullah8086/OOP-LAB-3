import java.util.*;
class Calculator{
public static void main(String args[])
 {
 System.out.println("Enter 1st value opperation and 2nd value respectively");
 int a=Integer.parseInt(args[0]);
 String sign=args[1];
 int b=Integer.parseInt(args[2]);
 int result=0;
 switch(sign){
 	case "+":
 	result=a+b;
 	System.out.print("Sum is "+result);
 	break;
   case "-":
 	result=a-b;
 	System.out.print("Result is "+result);
 	break;
   case "*":
 	result=a*b;
 	System.out.print("Result is "+result);
 	break;
    case "/":
 	result=a/b;
 	System.out.print("Result is "+result);
 	break;
   default :
   System.out.print("Invalid opperation");
 }


}
}