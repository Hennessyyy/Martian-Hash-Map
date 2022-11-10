package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MartianManager {
	protected HashMap<Integer,Martian> martians = new HashMap<>();
	protected HashMap<Integer,Teleporter>	teleporters = new HashMap<>();
	
	public MartianManager() {}
	
	public boolean	addMartian(Martian m) {
		if (martians.containsValue(m)) {
			return false;
		}
		martians.put(m.getId(),m);
		if (m instanceof Teleporter) {
			teleporters.put(m.getId(),(Teleporter) m);
		}
		return true;
	}
	
	
	public ArrayList<Martian> battle(ArrayList<Martian> invaders) {
		ArrayList<Martian> dead = new ArrayList<>();
		for (Martian o : invaders) {
			for (Martian p : martians.values()) {
				if (getPower(o) > getPower(p)) {
					dead.add(p);
					martians.remove(p.getId());
					break;
				}
			}
		}
		return dead;
		
		
	}
	
	//public ArrayList<Martian> battle2(ArrayList<Martian> invaders) {
	//	
	//}
	
	public boolean contains(int id) {
		
		return martians.containsKey(id);
	}
	
	
	public Martian getMartianClosestTo(int id) {
		Martian closest = new GreenMartian(Integer.MAX_VALUE, 0);
		for (Martian o : martians.values()) {
			if (Math.abs(o.getId() - id) < Math.abs(closest.getId() - id)) {
				closest = o;
			}
		}
		return closest;
	}
	
	public Martian getMartianClosestTo(Martian martian) {
		Martian closest = new GreenMartian(Integer.MAX_VALUE, 0);
		for (Martian o : martians.values()) {
			if ((Math.abs(o.getId() - martian.getId())) < (Math.abs(closest.getId() - martian.getId()))) {
				closest = o;
			}
		}
		return closest;
	}
	
	public Martian getMartian(int id) {
		if (martians.containsKey(id)) {
			return martians.get(id);
		}
		return null;
	}
	
	public int	getNumMartians() {
		return martians.size();
	}
	
	public int	getNumTeleporters() {
		return teleporters.size();
	}
	
	private int	getPower(Martian m) {
		if (m instanceof GreenMartian) {
			return m.getVolume();
		}
		return m.getVolume() + ((RedMartian)m).getTenacity();
	}
	
	public ArrayList<Martian> getSortedMartians(String comp) {
		ArrayList<Martian> sMartians = new ArrayList<>();
		for (Martian o : martians.values()) {
			sMartians.add(o);
		}
		if (comp.equals("ID")) {
			MartianIdComparator MC = new MartianIdComparator();
			Collections.sort(sMartians, MC);
		}
		else if (comp.equals("VOLUME")) {
			MartianVolumeComparator MV = new MartianVolumeComparator();
			Collections.sort(sMartians, MV);
		}
//		else {
//			throw new IllegalArgumentException("Enter either \"VOLUME\" or \"ID\"");
//		}
		
		return sMartians;
		
	}
	
	public void increaseTeleporterVolume(int idThreshold) {
		for (Teleporter o : teleporters.values()) {
			if (((Martian)o).getId() < idThreshold) {
				((Martian)o).setVolume(((Martian)o).getVolume() + 1);
			}
		}
	}
	
	public Teleporter getTeleporter(int id) {
		if (teleporters.containsKey(id)) {
			return teleporters.get(id);
		}
		return null;
	}
	
	public String groupSpeak() {
		String talk = "";
		for (Martian o : martians.values()) {
			talk += "\n"+ o.speak();
		}
		return talk;
	}
	
	public String	groupTeleport(String dest) {
		String tele = "";
		for (Teleporter o : teleporters.values()) {
			tele += "\n"+ o.teleport(dest);
		}
		return tele;
	}
	
	public void	obliterateTeleporters() {
		for (Teleporter o : teleporters.values()) {
			removeMartian(((Martian)o).getId());
		}
		teleporters.clear();
	}
	
	public Martian	removeMartian(int id) {
		
		if (!martians.containsKey(id)) {
			return null;
		}
		Martian g = getMartian(id);
		martians.remove(id);
		if (getMartian(id) instanceof Teleporter) {
			teleporters.remove(id);
		}
		return g;
	}
	
	@Override
	public String	toString() {
		String output = "";
		for (Martian o : martians.values()) {
			output += "" + o.toString() + "\n";
		}
		return output;
	}
	
	public static void main(String[] args) {
		
	}
}
