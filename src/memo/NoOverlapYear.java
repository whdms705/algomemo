package memo;

import java.util.Scanner;
import java.util.TreeSet;

//name_z
public class NoOverlapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeSet<String> set = new TreeSet<String>();
		
		//input year
		int n = sc.nextInt();
		boolean check = true;
		String result =null;
		
		while(check) {
			
			String temp = String.valueOf(n+1);
			int checkLen = temp.length();
			
			for(int i=0;i<checkLen;i++) {
				set.add(temp.substring(i, i+1));
			}
			if(set.size()==checkLen) {
				check = false;
				result = temp;
			}
			n++;
			set.clear();
		}
		
		System.out.println("result : "+result);
		
		

	}

}
