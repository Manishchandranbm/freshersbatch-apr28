
public class MinimumBalance extends Exception {
	
		String message;
		public MinimumBalance(String message) {
			this.message=message;
		}
		@Override
		public String toString() {
			return message;
		}
	}

