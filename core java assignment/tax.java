import java.util.Scanner;
public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the income");
double income = sc.nextDouble();

if((income>=0 && income<=180000)) {
	System.out.println("no need to pay tax");
}
	else if((income>=180001 && income<=300000)) {
		double tax = income*0.1;
		System.out.println("tax is"+" "+tax);	
	}
	else if((income>=300001 && income<=500000)) {
		double tax = income*0.2;
		System.out.println("tax is"+" "+tax);	
	}
	else if((income>=500001 && income<=1000000)) {
		double tax = income*0.3;
		System.out.println("tax is"+" "+tax);	
	}
sc.close();
}
	}


