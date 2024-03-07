class TooYoungException extends RuntimeException {
	TooYoungException(String s) {
		super(s);
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}
}

class CustomExceptionDemo {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]); // Using command line argument value should entered
		if (age < 18) {
			throw new TooYoungException("Please wait some more time... You will get best match");
		} else if (age > 60) {
			throw new TooOldException("Your age already crosssed... less chance of getting married");
		} else
			System.out.println("You will get match details soon by email");
	}
}