package prob1;

public class RedMartian extends Martian {
	private int tenacity=0;
	
	public RedMartian(int id, int volume, int tenacity) {
		super(id, volume);
		this.tenacity = tenacity;
	}
	
	public RedMartian(int id, int tenacity) {
		this(id, 1, tenacity);
	}
	
	public String speak() {
		return "Red Martian "+ getId() +": *very angry noises*";
	}
	
	public int getTenacity() {
		return tenacity;
	}
	
	@Override
	public String toString() {
		return "Red Martian - id="+ getId() +", vol="+ getVolume() +", ten="+ getTenacity();
	}
	
	public static void main(String[] args) {

	}

}
