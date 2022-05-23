import java.util.Scanner;
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter sub 1 marks");
int sub1marks = sc.nextInt();
System.out.println("enter sub 2 marks");
int sub2marks = sc.nextInt();
System.out.println("enter sub 3 marks");
int sub3marks = sc.nextInt();

if((sub1marks>60)&&(sub2marks>60)&&(sub3marks>60)) {
	System.out.println("student is passed");
}
	else if (sub1marks>60&&(sub2marks>60)||(sub1marks>60&&(sub3marks>60))||(sub1marks>60&&(sub2marks>60))){
		System.out.println("student is promoted");
	}
	else {
		System.out.println("student is failed");
	}
}
	}


