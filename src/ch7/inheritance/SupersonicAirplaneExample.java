package ch7.inheritance;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane supersonic = new SupersonicAirplane();
		
		supersonic.takeOff();
		supersonic.fly();
		supersonic.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonic.fly();
		supersonic.flyMode = SupersonicAirplane.NOMAL;
		supersonic.fly();
		supersonic.land();
	}
}
