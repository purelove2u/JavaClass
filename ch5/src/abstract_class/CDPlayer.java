package abstract_class;

public class CDPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("CD를 play합니다.");
	}

	@Override
	void stop() {
		System.out.println("CD를 stop합니다.");
	}
}
