import java.util.Scanner;
public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String username ="manish";
 String _name="manish.com";
 String _password="manish123";
 
 Scanner sc = new Scanner(System.in);
 
 for(int i=1;i<=3;i++) {
	 System.out.println("enter user name");
	 String name = sc.next();
	 System.out.println("enter the password");
	 String password = sc.next();
	 
	 if((_name.equals(name))&&(password.equals(_password))) {
		 System.out.println("welcome"+" "+username);
		 break;
	 }
	 else {
		 if(i==3) {
			 System.out.println("contact admin");
		 }
		 else {
			 System.out.println("sorry try again");
		 }
	 }
	 
 }
	}

}
