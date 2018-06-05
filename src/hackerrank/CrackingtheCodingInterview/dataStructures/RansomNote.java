package hackerrank.CrackingtheCodingInterview.dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @Content : 잡지의 단어를 통해 노트의 내용을 만들 수 있는지
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String magazine = "give me one grand today night";
		String note = "give one grand today";*/
		
		String magazine = "two times three is not four";
		String note = "two times two is four";
		
		String[] magazine_words = magazine.split(" ");
		String[] note_words = note.split(" ");
		//List<String> magazineList = new ArrayList<String>();
		LinkedList<String> magazineList = new LinkedList<String>();
		for(String s : magazine_words) {
			magazineList.add(s);
		}
	    
		int count = 0;
		int index = 0;
		boolean check = false;
		for(String s : note_words) {
			if(magazineList.contains(s)) {
				index = magazineList.indexOf(s);
				magazineList.remove(index);
				count++;
			}
			if(note_words.length==count) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		

	}

}
