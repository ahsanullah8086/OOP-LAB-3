import java.util.*;
class AlphabetType{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any English alphabet of lower case : ");
	char alpha=sc.next().charAt(0);
	switch(alpha){
    case 'a' :
    System.out.println(alpha+" is a vowel");
    break;
    case 'e': 
    System.out.println(alpha+" is a vowel");
    break;
    case 'i':
    System.out.println(alpha+" is a vowel"); 
    break;
    case 'o':
    System.out.println(alpha+" is a vowel");
    break;
    case 'u':
    System.out.println(alpha+" is a Vowel");
    break;
    default:
    System.out.println(alpha+" its consonent");
    break;
	}
}

}