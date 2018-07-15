package hackerRank.CrackingtheCodingInterview.algorithms;

import java.util.HashMap;
import java.util.Scanner;

/*
 * @ - ing
 */
		

public class IceCreamParlor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		int money = 4;
		//int[] cost = {1, 4, 5, 3, 2};
		int[] cost = {2 ,2, 4, 3};
		
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
		int key=1;
		
		for(int i:cost){
			hash.put(i,key++);
		}
		
		int first = 0;
		int second = 0;
		
		for(int i:cost){
			first = i;
			second = money-first;
			if(hash.get(second)!=null){
				break;
			}
		}
		System.out.println(hash.get(first)+" "+hash.get(second));
		

	}
	

}
