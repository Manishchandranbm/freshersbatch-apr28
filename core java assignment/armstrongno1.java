
public class armstrongno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=100;i<=999;i++) {
 int n=i,t=n;
 int sum =0;
 while(n>0) {
	 int d =n%10;
	 sum =sum+(d*d*d);
	 n=n/10;
 }
 if(t==sum) {
	 System.out.println(i+" ");
 }
}
	}

}
