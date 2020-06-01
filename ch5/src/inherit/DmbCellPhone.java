package inherit;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	
}
