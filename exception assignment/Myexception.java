import java.util.Scanner;
public class Myexception extends Exception {
	String message;
	public Myexception(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
}

