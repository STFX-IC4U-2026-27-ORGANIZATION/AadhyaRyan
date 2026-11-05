package assignments;

import assignments.Wizard;
import templates.Student;

import java.io.*;

public class U3A4D_UnsortedSearch {

	// DESCRIPTION -  iterative linear search on an unsorted WizardingWorld array.
	// PARAMETERS - WizardingWorld[] array, String searchPattern
	// RETURN TYPE - int 
	public static int searchWizards(Wizard[] array, String searchPattern) {
		if (array == null || searchPattern == null) {
			return -1;
		}

		String pattern = searchPattern.trim();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				
				if (array[i].house.equalsIgnoreCase(pattern) ||
					array[i].blood.equalsIgnoreCase(pattern) ||
					array[i].wand.equalsIgnoreCase(pattern) ||
					array[i].lineage.equalsIgnoreCase(pattern)) {
					return i;
				}
			}
		}

		return -1;
	}
	


	// DESCRIPTION - recursive linear search on an unsorted WizardingWorld array.
	// PARAMETERS - WizardingWorld[] array, String searchPattern, int index
	// RETURN TYPE - int 
	public static int searchWizardsRecursive(Wizard[] array, String searchPattern, int index) {
		if (array == null || index >= array.length) {
			return -1;
		}

		String pattern = searchPattern.trim();

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