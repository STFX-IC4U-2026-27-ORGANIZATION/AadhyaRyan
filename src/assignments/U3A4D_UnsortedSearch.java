package assignments;
import assignments.Wizard;
import java.io.*;

public class U3A4D_UnsortedSearch 	{

	// DESCRIPTION - Returns index of House object that corrresponds to the house if it dosen't it returns -1
	// PARAMETERS - (Wizard[] a, String house, int index)
	// RETURN TYPE - int
	public static int searchHouse (Wizard[] a, String house, int index) {
		
		if(index > a.length-1)
			return -1;
		
		if (a[index].getIdentifier().equalsIgnoreCase(house))
			return index;
		
		return searchHouse(a,house, index+1);
	}
	
	// DESCRIPTION - Returns index of Blood object that corrresponds to the blood if it dosen't it returns -1
	// PARAMETERS - Wizard[] a, String blood, int index) {
	// RETURN TYPE - int
	
	public static int searchBlood (Wizard[] a, String blood, int index) {
		
		if(index > a.length-1)
			return -1;
		
		if (a[index].getBlood().equalsIgnoreCase(blood))
			return index;
		
		return searchBlood(a,blood, index+1);
	}

	// DESCRIPTION - Returns index of wand object that corrresponds to the wand if it dosen't it returns -1
	// PARAMETERS - Wizard[] a, String wand, int index) {
	// RETURN TYPE - int
	
	public static int searchWand (Wizard[] a, String wand, int index) {
		
		if(index > a.length-1)
			return -1;
		
		if (a[index].getWand().equalsIgnoreCase(wand))
			return index;
		
		return searchBlood(a,wand, index+1);
	}
	
	// DESCRIPTION - Returns the index of the first wizard in the array that has that lineage
	//PARAMETERS - Wizard[] w, String lineage, int index
	// RETURN TYPE - int
	
	public static int searchLineage(Wizard[] w, String lineage, int index) {
		
		// error case
		if (w == null || index < 0 || index >= w.length || w[index] == null)
			return -1;

		// base case
		if (w[index].getLineage().equalsIgnoreCase(lineage))
			return index;
	
		else
			return searchLineage(w, lineage, index+1);

	}
}