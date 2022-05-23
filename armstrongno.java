import java.util.Scanner;
public class armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int sum =0;
 int t=n;
 
 do {
	 int d=n%10;
	 sum=sum+d*d*d;
	 n=n/10;
 }
 while(n!=0);
 if(t==sum)
	 System.out.println("its an armstrong no");
 else
	 System.out.println("its not a armstrong no");
 }

}
