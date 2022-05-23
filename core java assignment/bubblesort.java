
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] numArray = {5,12,14,6,78,19,1,23,26,35,37,7,86,47};
 
 System.out.println("array before swapping");
 for(int i:numArray) {
	 System.out.println(i+" ");
 }
 int n =numArray.length;
 int temp =0;
 for(int i=0;i<n;i++) {
	 for(int j=1;j<(n-1);j++) {
		 if(numArray[j-1]>numArray[j]) {
			 temp=numArray[j-1];
			 numArray[j-1]=numArray[j];
			 numArray[j]=temp;
		 }
	 }
 }
 System.out.println();
 System.out.println("array after swapping");
 
 for(int i :numArray) {
	 System.out.println(i+" ");
 }
	}

}
