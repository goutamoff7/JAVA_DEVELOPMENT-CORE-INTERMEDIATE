package exceptionHandling;
public class CustomException3 {
	public static void main(String[] args) {
		throw new Exception();
	}
}
// error: unreported exception Exception; must be caught or declared to be
// thrown
// this compilation error occurs because some child class of Exception class are
// belongs to checked exception like IOException etc which must be
// caught/handled by
// try-catch
// or need to be thrown using throws keyword