public class CharacterCkeckString {
	public static void main(String[] args) {
		String s = "Umbrella";
		int index = s.indexOf('e');
		if (index != -1)
			System.out.println("e is present in 'Umbrella' at Index: " + index);
		else
			System.out.println("e is not present in 'Umbrella'");
	}
}
