import java.util.Scanner;
public class Exception2 {
		public static void main(String[] args) throws Myexception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			int n1=sc.nextInt();
			System.out.println("Enter second number");
			int n2=sc.nextInt();
			try {
			int res=n1/n2;
			System.out.println(res);
			
			}
			catch (ArithmeticException ae){
				System.out.println("UnsupportedOperationException");
				ae.printStackTrace();
			}
		}

	}

