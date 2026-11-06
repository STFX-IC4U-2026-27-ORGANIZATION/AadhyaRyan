package assignments;
import assignments.Wizard;
import java.io.*;

public class U3A4D_UnsortedSearch 	{

	// DESCRIPTION - recursive linear search on an unsorted WizardingWorld array.
	// PARAMETERS - WizardingWorld[] array, String searchPattern, int index
	// RETURN TYPE - int 
	public static int searchWizardsRecursive(Wizard[] array, String searchPattern, int index) {
		if (array == null || index >= array.length) {
			return -1;
		}

		String pattern = searchPattern;

		if (array[index] != null) {
			if (array[index].house.equalsIgnoreCase(pattern) ||
				array[index].blood.equalsIgnoreCase(pattern) ||
				array[index].wand.equalsIgnoreCase(pattern) ||
				array[index].lineage.equalsIgnoreCase(pattern)) {
				return index;
			}
		}

		return searchWizardsRecursive(array, searchPattern, index + 1);
	}
	
	
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
	
	// DESCRIPTION - Returns index of Blood object that corrresponds to the house if it dosen't it returns -1
	// PARAMETERS - Wizard[] a, String blood, int index) {
	// RETURN TYPE - int
	
	public static int searchBlood (Wizard[] a, String blood, int index) {
		
		if(index > a.length-1)
			return -1;
		
		if (a[index].getBlood().equalsIgnoreCase(blood))
			return index;
		
		return searchBlood(a,blood, index+1);
	}
	
	// DESCRIPTION - Returns index of Wizard object that corrresponds to the house if it dosen't it returns -1
	// PARAMETERS - Wizard[] a, String wand, int index) {
	// RETURN TYPE - int
	
	public static int searchWand (Wizard[] a, String wand, int index) {
		
		if(index > a.length-1)
			return -1;
		
		if (a[index].getWand().equalsIgnoreCase(wand))
			return index;
		
		return searchBlood(a,wand, index+1);
	}
}