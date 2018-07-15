package hackerRank.CrackingtheCodingInterview.algorithms;

import java.util.HashMap;
import java.util.Iterator;

public class IceCreamParlor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int money = 8;
	      //int[] cost = {1, 4, 5, 3, 2};
	      //int[] cost = {2 ,2, 4, 3};
	      int[] cost = {4, 3, 2, 5, 7};
	      
	      HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
	      int key=1;
	      
	      for(int i:cost){
	         hash.put(key++,i);
	      }

	      int first = 0;
	      int second = 0;
	      
	      int key1 = 1;
	      int key2 = 0;
	      
	      
	      
	      for(int i:cost){
	         HashMap<Integer,Integer> temp = (HashMap<Integer, Integer>) hash.clone();
	         temp.remove(key1);
	         first = i;
	         second = money-first;
	         if(temp.containsValue(second)){
	            break;
	         }
	         key1++;
	      }
	      
	      Iterator<Integer> keys = hash.keySet().iterator();
	      while( keys.hasNext() ){
	         
	              int keyValue = keys.next();
	              if(keyValue!=key1 && hash.get(keyValue)==second){
	                 key2 = keyValue; 
	              }
	              
	      }
	      
	      System.out.println(key1+" "+key2);

		
	}

}
