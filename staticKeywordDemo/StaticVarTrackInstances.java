package staticKeywordDemo;
public class StaticVarTrackInstances {
	static int count = 0;

	{
		count++;
	}

	static void instanceCounter() {
		System.out.println("Number of Instances: " + count);
	}

	public static void main(String[] args) {
		new StaticVarTrackInstances();
		new StaticVarTrackInstances();
		new StaticVarTrackInstances();
		new StaticVarTrackInstances();
		new StaticVarTrackInstances();
		instanceCounter();
	}
}
