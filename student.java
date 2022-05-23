import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student1 marks");
		int stu1a =sc.nextInt();
		int stu1b =sc.nextInt();
		int stu1c =sc.nextInt();
		
		System.out.println("enter student2 marks");
		int stu2a =sc.nextInt();
		int stu2b =sc.nextInt();
		int stu2c =sc.nextInt();
		
		System.out.println("enter student3 marks");
		int stu3a =sc.nextInt();
		int stu3b =sc.nextInt();
		int stu3c =sc.nextInt();
		
		float totalmarks =stu1a+stu1b+stu1c+stu2a+stu2b+stu2c+stu3a+stu3b+stu3c;
		
		float avgmarks = totalmarks/9;
		System.out.println("total marks of all students"+" "+totalmarks);
		System.out.println("average marks of all student"+" "+avgmarks);
		System.out.println();
	}

}
