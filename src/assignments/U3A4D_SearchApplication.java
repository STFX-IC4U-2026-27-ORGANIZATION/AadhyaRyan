package assignments;
import assignments.U3A4D_UnsortedSearch;

public class U3A4D_SearchApplication {

	public static int searchAll(Wizard[] w, String word, int index) {
		int houseNum = assignments.U3A4D_UnsortedSearch.searchHouse(w, word, index);
		int bloodNum = assignments.U3A4D_UnsortedSearch.searchBlood(w, word, index);
		int wandNum = assignments.U3A4D_UnsortedSearch.searchWand(w, word, index);
		int lineageNum = assignments.U3A4D_UnsortedSearch.searchHouse(w, word, index);
		
		if (houseNum != -1) {
			return houseNum;
		} else if (bloodNum != -1) {
			return bloodNum;
		} else if (wandNum != -1) {
			return wandNum;
		} else if (lineageNum != -1)
			return lineageNum;
		
		else return -1;
		
	}
	
	
}
