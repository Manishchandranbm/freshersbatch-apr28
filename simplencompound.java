import java.util.Scanner;
public class simplencompound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount");
		
		float pamount = sc.nextFloat();
		float rate =2;
		float time = 6;
		
		float si = (pamount*rate*time)/100;
		System.out.println("simple intrest is"+" "+si);
		
		float ci = (float)(pamount*Math.pow(1+rate/100, time));
		System.out.println("compound intrest is"+" "+ci);
	}

}
