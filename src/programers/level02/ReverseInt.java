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
	  
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		public static void  main(String[] args){
			ReverseInt ri = new ReverseInt();
			System.out.println(ri.reverseInt(118372));
		}

}
