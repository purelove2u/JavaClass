package inherit;

public class GameEx {

	public static void main(String[] args) {
		Marine marine = new Marine();
		marine.x = 1;
		marine.y = 2;
		marine.move(2, 3);
		marine.stop();
		marine.stimPack();
				
		Tank tank = new Tank();
		tank.x = 4;
		tank.y = 5;
		tank.move(6, 7);
		tank.changeMode();
		
		Dropship dropship = new Dropship();
		dropship.x = 8;
		dropship.y = 9;
		dropship.move(10, 11);
		dropship.stop();
		dropship.load();
		dropship.upload();
		
	}

}
