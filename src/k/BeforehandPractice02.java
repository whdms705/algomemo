package k;

import java.util.Set;
import java.util.TreeSet;

/*
길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.

제한사항
배열의 길이는 10만 이하입니다.
배열의 원소는 10만 이하의 자연수입니다.

입출력 예 설명
입출력 예 #1
입력이 [4, 1, 3, 2]가 주어진 경우, 배열의 길이가 4이므로 배열에는 1부터 4까지 숫자가 모두 들어 있어야 합니다. [4, 1, 3, 2]에는 1부터 4까지의 숫자가 모두 들어 있으므로 true를 반환하면 됩니다.

입출력 예 #2
[4, 1, 3]이 주어진 경우, 배열의 길이가 3이므로 배열에는 1부터 3까지 숫자가 모두 들어 있어야 합니다. [4, 1, 3]에는 2가 없고 4가 있으므로 false를 반환하면 됩니다.
*/



public class BeforehandPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={4, 1, 3, 2};
		int num1=arr.length;
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<num1;i++){
			set.add(i+1);
		}
		
		for(int i : arr){
			set.remove(i);
		}
		
		if(set.size()==0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
