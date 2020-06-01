package abstract_class;

public class AudioPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("Audio를 play합니다.");
	}

	@Override
	void stop() {
		System.out.println("Audio를 stop 합니다.");
	}
}
