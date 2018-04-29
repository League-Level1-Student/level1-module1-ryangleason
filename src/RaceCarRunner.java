import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar a = new RaceCar("Supah Slow", 5);
	System.out.println();
	a.getPositionInRace();
	System.out.println(a.getPositionInRace());
	a.crash();
	a.pit();
	for (int i = 0; i < 7; i++) {
		
a.overtake();
	}
		// 3. Get the RaceCar to print its position in the race.

		// 4. Crash the RaceCar
		
		// 5. If the car is damaged. Bring it in for a pit stop.

		// 6. Help the car move into first place.

	}
}
