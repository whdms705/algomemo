package k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="E=M*C^2";
		String str2="e=m*c^2";
		
	/*	String str1="E=M*C^2";
		String str2="e=m*c^2";*/
		
		
		//특수문자 공백처리
	    String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";

	    str1 =str1.replaceAll(match, " ");
	    str2 =str2.replaceAll(match, " ");

	    
	    String[] temp1=str1.split("");
	    String[] temp2=str2.split("");
	    
	    temp1=convertNumber(temp1);
	    temp2=convertNumber(temp2);
	    
	    ArrayList<String> list1 = new ArrayList<String>();
	    ArrayList<String> list2 = new ArrayList<String>();

	    String part1="";
	    for(int i=0;i<temp1.length-1;i++){
	    	part1=temp1[i]+temp1[i+1];
	    	if(!part1.contains(" ")){
	    		list1.add(part1.toUpperCase());
	    	}
	    }
	    
	    System.out.println("----------");
	    String part2="";
	    for(int i=0;i<temp2.length-1;i++){
	    	part2=temp2[i]+temp2[i+1];
	    	if(!part2.contains(" ")){
	    		list2.add(part2.toUpperCase());
	    	}
	    }
	    
	    System.out.println("+++++++++++++++++");
	    

	    int a=intersection(list1,list2).size();
	    int b=union(list1,list2).size();
	    System.out.println("a : "+a +" / b: "+b);
	    if(a==0&&b==0){
	    	System.out.println(1*65536);
	    }else{
	    	System.out.println((double)a%b);
	    	System.out.println((double)a/b);
		    double temp=((double)a/b)*65536;
		    System.out.println("double value : "+temp);
		    // 소수점 버리기
		    int result;
		    result = (int) temp;
		    System.out.println(result);
	    }
	    
		
		
	}
	
	 public static ArrayList<String> union(ArrayList<String> A, ArrayList<String> B) {

		 final Set<String> primarySet = new HashSet<String>();
		 primarySet.addAll(A);
		 primarySet.addAll(B);

		 final ArrayList<String> primaryList = new ArrayList<String>(primarySet);
		 final int primaryListSize = primaryList.size();
		 final int aSize = A.size();
		 final int bSize = B.size();

		 final ArrayList<String> multisetUnionList = new ArrayList<String>();
		 int multisetUnionCount = 0;

		 for (int x = 0; x < primaryListSize; x++) {
		     final String primaryInt = primaryList.get(x);
		     int aHit = 0;
		     int bHit = 0;
		     if (A.contains(primaryInt)) {
		         for (int y = 0; y < aSize; y++){
		             if (primaryInt.equals(A.get(y))) {
		                 aHit++;
		             }
		         }
		     }
		     if (B.contains(primaryInt)) {
		         for (int k = 0; k < bSize; k++){
		             if (primaryInt.equals(B.get(k))) {
		                 bHit++;
		             }
		         }
		     }

		     multisetUnionCount = Math.max(aHit, bHit);
		     if (multisetUnionCount > 0) {
		         for (int i = 0; i < multisetUnionCount; i++) {
		             multisetUnionList.add(primaryInt);
		         }
		     }
		 }
		 
		 return multisetUnionList;
		 
	  }
	 
    public static ArrayList<String> intersection(ArrayList<String> list1, ArrayList<String> list2) {
    	ArrayList<String> list = new ArrayList<String>();
 
        for (String t : list1) {
            if (list2.contains(t)) {
                list.add(t);
            }
        }
 
        return list;
    }
    
    public static boolean isNumber(String str){
        boolean result = false;
         
         
        try{
            Double.parseDouble(str) ;
            result = true ;
        }catch(Exception e){}
         
         
        return result ;
    }
    
    //숫자 공백으로 처리
    public static String[] convertNumber(String[] temp1){
    	String[] arr=temp1;
    	for(int i=0;i<arr.length;i++){
    		if(isNumber(arr[i])){
    			arr[i]=" ";
    		}
    	}
    	
    	
    	return arr;
    }



}
