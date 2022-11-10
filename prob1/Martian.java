package prob1;

public abstract class Martian implements Comparable<Martian>{
	private int	id=0;
	private int	volume=0;
	
	public Martian(int id, int volume) {
		this.id = id;
		this.volume = volume;
	}
	
	public int compareTo(Martian m) {
		return id - m.getId();
	}
	
	@Override
	public boolean equals(Object o) {
		if (id == ((Martian) o).getId()) {
	         return true;
	      }
	      else {
	         return false;
	      }
		
	}
	
	public int getId() {
		return id;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public abstract String speak();
	
	@Override
	public String toString() {
		return "id=" + id + ", vol="+ volume;
	}
	
	public static void main(String[] args) {
		
	}

}
