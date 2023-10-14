public class Setter_Getter {
	private int value;

	public void setValue(int vlaue) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Setter_Getter ob = new Setter_Getter();
		ob.setValue(10);
		System.out.println("Value = " + ob.getValue());
	}
}
