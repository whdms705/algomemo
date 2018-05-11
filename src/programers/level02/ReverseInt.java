package programers.level02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ReverseInt {

	public int reverseInt(int n){
		String num = String.valueOf(n);
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num.length();i++){
			list.add(Integer.parseInt(num.substring(i, i+1)));
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		for(int i=0;i<num.length();i++){
			sb.append(list.get(i));
		}
	    
		return Integer.parseInt(sb.toString());
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}


}
