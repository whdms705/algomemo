package daily;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 
 * 
정수 배열과 타겟 숫자가 주어지면, 합이 타겟값이 되는 두 원소의 인덱스를 찾으시오.

단, 시간복잡도 O(n) 여야 합니다.



예제)

Input: [2, 5, 6, 1, 10], 타겟 8

Output: [0, 2] // 배열[0] + 배열[2] = 8
 * 
 */


public class DailyPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr={2, 5, 6, 1, 10};
		int target = sc.nextInt();
		solution(arr,target);
	}
	
	public static void solution(int[] arr,int target){
		int[] result = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i], i);
		}
		
		
		for(int i=0;i<arr.length;i++){
			int check = target-arr[i];
			if(map.containsKey(check)){
				result[0]=i;
				result[1]=map.get(check);
			}
		}
		
System.out.println("[ "+result[0]+" , "+result[1]+" ]");
		
	}

}
