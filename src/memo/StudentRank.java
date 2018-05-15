package memo;

import java.util.Arrays;
import java.util.HashMap;

public class StudentRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		//input
		int[] student= {2,2,1};
		int temp=0;
		int tempRank=0;
		
		int leng = student.length;
		int[] result = new int[leng];
		
		for(int i=0;i<leng;i++) {
			result[i] = student[i];
		}
		Arrays.sort(student);
		
		
		// 배열 순서 거꾸로
	    reverseArrayInt(student);
		
		for(int i=0;i<leng;i++) {
			System.out.println(student[i]);
			if(i==0) {
				tempRank=i+1;
				temp = student[i];
				map.put(student[i], tempRank);
				
			}else {
				if(student[i]==temp) {
					map.put(student[i], tempRank);
				}else {
					tempRank=i+1;
					temp = student[i];
					map.put(student[i],tempRank);
				}
			}
			
		}
		
		//return result
		for(int i=0;i<leng;i++) {
			System.out.println(map.get(result[i]));
		}
		
		
		

	}
	
	public static void reverseArrayInt(int[] array) {
	    int temp;

	    for (int i = 0; i < array.length / 2; i++) {
	      temp = array[i];
	      array[i] = array[(array.length - 1) - i];
	      array[(array.length - 1) - i] = temp;
	    }
	  }

}
