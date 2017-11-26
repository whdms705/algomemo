package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;// 몇명
		int d; // 방향   >> 1:시계방향 , 0:반시계방향
		int k,j;// 얼만큼 이동
		//System.out.println("몇명으로 시작한가요?");
		n=sc.nextInt();
		//System.out.println("방향을 입력하시오");
		d=sc.nextInt();
		//System.out.println("k,j입력");
		k=sc.nextInt();
		j=sc.nextInt();
		solution(n,d,k,j);
	}
	
	public static void solution(int n,int d,int k,int j){
		System.out.println("----");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(0);
		}
		
		for(int i : list){
			System.out.println(">> "+i);
		}
		
		
		
		
		
		
	}

}
