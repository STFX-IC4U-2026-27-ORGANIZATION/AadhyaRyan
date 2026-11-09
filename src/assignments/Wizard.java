package assignments;

public class Wizard {
	
	// data members
	String house;
	String blood;
	String wand;
	String lineage;
	
	// default constructor 
	public Wizard() {
		house = "";
		blood = "";
		wand = "";
		lineage = "";
		
	}
	
	// parameterized constructor
	public Wizard(String h, String b, String w, String l) {
		house = h;
		blood = b;
		wand = w;
		lineage = l;
	}
	
	// house getter
	public String getHouse() {
		return this.house;
	}
	
	// house setter
	public void setHouse(String h) {
		this.house = h;
	}
	
	// blood getter
	public String getBlood() {
		return this.blood;
	}
	
	// blood setter
	public void setBlood(String b) {
		this.house = b;
	}
	
	// wand getter
	public String getWand () {
		return this.wand;
	}
	
	// wand setter
	public void setWand(String w) {
		this.wand = w;
	}
	
	// lineage getter
	public String getLineage() {
		return this.lineage;
	}
	
	// lineage setter
	public void setLineage(String l) {
		this.lineage = l;
	}
 
	@Override
	public String toString() {
		return super.toString() + "." + this.house + "." + this.blood + "." + this.wand + "." + this.lineage;
	}


}
