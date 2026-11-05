package assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class U3A4DLoadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Wizard[] loadWizardsFromFile(String fileName) {

			BufferedReader br = null;
			ArrayList <Wizard> wizards = new ArrayList();
			String line = "";

			try {
	
				br = new BufferedReader(new FileReader(fileName));	
	
				while ((line = br.readLine()) != null) {
		
					String[] partsOfName = line.trim().split(" ");
					String house = partsOfName[0];
					String blood = partsOfName[1];
					String wand = partsOfName[2];
					String lineage = partsOfName[3];
					wizards.add(new Wizard(house, blood, wand, lineage));
				}
		
			}
	
	
			catch (Exception e) {
				System.out.println(e + "Failed to read list of wizards");
			}

			
			Wizard[] wizardList = new Wizard[wizards.size()];
			wizards.toArray(wizardList);
			return wizardList;
		}


}