package prob1;

public class GreenMartian extends Martian implements Teleporter{
	
	public GreenMartian(int id, int volume) {
		super(id, volume);
	}
	
	public GreenMartian(int id) {
		this(id, 1);
	}
	
	public String speak() {
		return "Green Martian "+ getId() +": *angry noises*";
	}
	
	public String teleport(String dest) {
		return "Green Martian "+ getId() +" is teleporting to "+ dest;
	}
	
	@Override
	public String toString() {
		return "Green Martian - id="+ getId() +", vol="+ getVolume();
	}
	
	public static void main(String[] args) {
		
	}
}
