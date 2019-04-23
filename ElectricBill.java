import java.util.*;
class ElectricBill{
public static void main ( String args []){

Scanner sc=new Scanner(System.in);
System.out.println("Enter units used in this month");
int unit=sc.nextInt();
if (unit<=50){
System.out.print("your bill of the month " + (unit*10) );
}
else if(unit>50 && unit<=100){

	System.out.print("your bill of the month " + ((50*10)+(unit-50)*15));
} 
else if(unit>100 && unit<=200){
	System.out.print("your bill of the month " +((50*10)+(50*15)+(unit-100)*20));
}
else if(unit>200 && unit<=300){
	System.out.print("your bill of the month "+((50*10)+(50*15)+(100*20)+(unit-200)*30));
}

}
}