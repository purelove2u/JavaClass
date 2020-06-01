package abstract_class;

public class PlayerEx {

	public static void main(String[] args) {
		Player player = new AudioPlayer();
		print(player);
		
		CDPlayer cdplayer = new CDPlayer();
		print(cdplayer);
//		player.play(2);
//		player.stop();
//		
//		player = new CDPlayer();
//		player.play(3);
//		player.stop();		
	}
	
	public static void print(Player player) {
		player.play(5);
		player.stop();
	}

}
