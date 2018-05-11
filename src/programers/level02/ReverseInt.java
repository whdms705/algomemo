package programers.level02;

import java.util.TreeSet;

public class ReverseInt {

	public int reverseInt(int n){
		  String num = String.valueOf(n);
		  
		  int[] arr = new int[num.length()];
		  for(int i=0;i<num.length();i++) {
			  arr[i]=Integer.parseInt(num.substring(i, i+1));
		  }
		  System.out.println(num);
	    
			return 0;
		}
	  
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		public static void  main(String[] args){
			ReverseInt ri = new ReverseInt();
			System.out.println(ri.reverseInt(118372));
		}

}
