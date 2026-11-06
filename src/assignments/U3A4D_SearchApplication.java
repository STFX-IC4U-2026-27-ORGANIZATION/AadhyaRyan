package assignments;
import assignments.U3A4D_UnsortedSearch;

public class U3A4D_SearchApplication {

	public static int searchAll(Wizard[] w, String word, int index) {
		int houseNum = assignments.U3A4D_UnsortedSearch.searchHouse(w, word, index);
		
		if (houseNum != -1) {
			return houseNum;
		}
		
		int bloodNum = assignments.U3A4D_UnsortedSearch.searchBlood(w, word, index);
		int wandNum = assignments.U3A4D_UnsortedSearch.searchWand();
		int lineageNum = assignments.U3A4D_UnsortedSearch.searchHouse(w, word, index);
		
		
	}
	
	
}
