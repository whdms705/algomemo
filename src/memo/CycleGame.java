package memo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CycleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6};
		
		int n = arr.length;
		int d=1;
		int k=7;
		int j=2;
		
		int len = arr.length;
		int count=0;
		int check=0;
		int curIndex=0;
		
		int result=0;
		
		/*d=sc.nextInt();
		k=sc.nextInt();
		j=sc.nextInt();*/
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<len;i++){
			list.add(i);
		}
		//System.out.println("list.indexOf() :"+list.indexOf(2));
		//list.remove(list.indexOf());
		if(d==0){
			reverse(arr);
		}
		
		
		while(check!=n-1){

			if(check==0){
				int tempIndex = (k%len);
				arr[tempIndex]=0;
				curIndex = tempIndex;
			}else{
				int tempIndex = (k%len);
				for(int i=0;i<tempIndex;){
					if(arr[(curIndex+1)%n]!=0){
						curIndex = (curIndex+1)%n;
						i++;
					}else{
						curIndex+=1;
					}
				}
				arr[curIndex]=0;
			}
			
			check++;
			len=len-1;
			k=k+j;
			list.remove(list.indexOf(curIndex));
			
			System.out.println("curIndex : "+curIndex);
			System.out.println("check : "+check);
		}
		System.out.println("list : "+list.get(0));
		
		
	}
	
	
	
	//int array reverse 
	public static int[] reverse(int[] arr){
		int left  = 0;             // 맨 좌측 요소의 첨자
	    int right = arr.length - 1;  // 맨 우측 요소의 첨자

	    while (left < right) {
	      int temp = arr[left];
	      arr[left]  = arr[right];     // 좌우 요소 교환
	      arr[right] = temp;

	      left++; right--;         // 배열의 중간 부분으로 한칸씩 이동
	    }
	    
	    // exchange start index , end index
	    int temp=arr[0];
	    arr[0]=arr[arr.length-1];
	    arr[arr.length-1] = temp;
	    return arr;
	}

}
