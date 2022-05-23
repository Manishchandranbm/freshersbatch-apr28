import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numArray = {5,12,14,6,78,19,1,23,26,35,37,7,86,47};
Scanner sc = new Scanner(System.in);
System.out.println("enter the number you have to find");
int num =sc.nextInt();

boolean isfound =false;
for(int i:numArray) {
	if(i==num) {
		isfound=true;
		break;
	}
}
if(isfound) {
	System.out.println(num+" "+"is present");
}
else {
	System.out.println(num+" "+"is not present");
}
	}

}
