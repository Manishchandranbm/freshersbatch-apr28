import java.util.Scanner;
public class Exception3 extends Exception {
static double balance=2000;
	
	public static void main(String[] args) throws MinimumBalance {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdrawn");
		int n=sc.nextInt();
		try {
			if(balance<n) {
				throw new MinimumBalance("InsufficientBalanceException " +balance);
			}
			if(n<0) {
				throw new MinimumBalance("IllegalBankTransactionException");
			}
			else {
				System.out.println("Please collect your money!");
			}
		}
		catch(MinimumBalance mab) {
			mab.printStackTrace();
		}
		
	}

}
