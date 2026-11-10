package sandbox;
import assignments.Wizard;
import assignments.U3A4D_UnsortedSearch;

public class U3A4D_RyanTestCase {

	public static void main(String[] args) {

		Wizard[] newArray = new Wizard[2];
		Wizard object = new Wizard ("Ravenclaw", "Half", "Holly", "Weasley");
		Wizard object1 = new Wizard("Hufflepuff", "Pure", "Vine", "Potter");
		
		newArray[0] = object;
		newArray[1] = object1;
		
		System.out.println(U3A4D_UnsortedSearch.searchHouse(newArray, "Ravenclaw", 0));


		



	}

}
