package daily;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 
 * 
���� �迭�� Ÿ�� ���ڰ� �־�����, ���� Ÿ�ٰ��� �Ǵ� �� ������ �ε����� ã���ÿ�.

��, �ð����⵵ O(n) ���� �մϴ�.



����)

Input: [2, 5, 6, 1, 10], Ÿ�� 8

Output: [0, 2] // �迭[0] + �迭[2] = 8
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
