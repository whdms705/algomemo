package k;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BeforehandPractice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"app","ap","p","l","e","ple","pp"};
		String t="apple";
		int c=0;
		int i[]=new int[strs.length];
		for(String s : strs){
			i[c++]=s.length();
		}
		Arrays.sort(strs);
		
		for(String s : strs){
			System.out.print(s+" ");
		}
		//int min=i[0];
		//int max=i[i.length-1];
		
		
		
		
	}

}
