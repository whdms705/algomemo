package insight;

import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("k값만 큼 이동");
		int[] arr={1,2,3,4,5,6};
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		solution(arr,k);
		

	}
	
	static public void solution(int[] arr,int k){
		k=k%arr.length;
		System.out.println(k);
		int[] temp=new int[arr.length];
	
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			int index=(i+k)%arr.length;
			temp[index]=arr[i];
		}
		
		for(int j=0;j<arr.length;j++){
			System.out.print(temp[j]+" ");
		}
		
	}

}
