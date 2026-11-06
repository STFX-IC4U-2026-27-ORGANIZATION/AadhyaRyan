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
}