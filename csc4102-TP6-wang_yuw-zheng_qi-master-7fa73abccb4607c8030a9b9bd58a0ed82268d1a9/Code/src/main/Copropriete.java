package src.main;
import java.util.*;

public class Copropriete {
	private int id;
	private HashSet<AssembleeGeneral> ags;
	
	public Copropriete(int id) {
		this.id = id;
		ags = new HashSet<AssembleeGeneral>();
	}
	public int getId() {
		return id;
	}
	public HashSet<AssembleeGeneral> getAgs() {
		return ags;
	}
	public void addAg(AssembleeGeneral ag){
    	ags.add(ag);    	
    }
}
