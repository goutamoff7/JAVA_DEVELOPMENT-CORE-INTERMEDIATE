class AeroPlane {
	public void fly() {
		System.out.println("Aeroplane is flying");
	}

	public void takeOff() {
		System.out.println("Aeroplane is taking Off");
	}

	public void carry() {
		System.out.println("Aeroplane can carry everything");
	}
}

class PassengerPlane extends AeroPlane {
	@Override
	public void fly() {
		System.out.println("Passerger Plane flies at medium height ");
	}

	@Override
	public void takeOff() {
		System.out.println("Passenger Plane needs medium size runway");
	}

	@Override
	public void carry() {
		System.out.println("Passenger Plane is carrying Passenger");
	}
}

class CargoPlane extends AeroPlane {
	@Override
	public void fly() {
		System.out.println("Cargo Plane flies at lower height ");
	}

	@Override
	public void takeOff() {
		System.out.println("Cargo Plane needs longer size runway");
	}

	@Override
	public void carry() {
		System.out.println("Cargo Plane is carrying goods");
	}
}

class FighterPlane extends AeroPlane {
	@Override
	public void fly() {
		System.out.println("Fighter Plane flies at higher height");
	}

	@Override
	public void takeOff() {
		System.out.println("Fighter Plane needs shorter runway ");
	}

	@Override
	public void carry() {
		System.out.println("Fighter Plane is carrying weapons");
	}

}

class Airport {
	public void poly(AeroPlane ref) // method which receives parent or its child object reference
	{
		ref.fly();
		ref.takeOff();
		ref.carry();
		System.out.println("------------------------------------------");
	}
}

public class PolymorphismExample1 {
	public static void main(String[] args) {
		PassengerPlane pp = new PassengerPlane();
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		a.poly(pp);
		a.poly(cp);
		a.poly(fp);

	}
}
