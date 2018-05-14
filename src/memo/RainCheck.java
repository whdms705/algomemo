package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
 * 최대한 비를 담을 수 있는공간을 확보
 */

public class RainCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		//int[] br ={0,2,0,1,3,1,2,0,1,0,2,0};
		int[] br ={1,2,3,4,5,6,7};
		int max=0;
		int leng=br.length;
		int sum=0;
		
		for(int a:br){
			set.add(a);
		}
		
		max = set.last();
		
		List<Integer> list=null;
		for(int i=0;i<max;i++){
			list=new ArrayList<Integer>();
			for(int j=0;j<leng;j++){
				if(br[j]==0){
					list.add(0);
				}else{
					list.add(1);
					br[j]=br[j]-1;
				}
				
			}
			sum+=count(list);
		}
		
		System.out.println("sum : "+sum);
		
	}
	
	static public int count(List<Integer> list){
		int count=0;
		int start=0;
		int end=0;
		
		for(int i=0;i<list.size();i++){
			if(list.get(i)==1){
				start=i;
				break;
			}
		}
		for(int i=list.size()-1;i>=0;i--){
			if(list.get(i)==1){
				end=i;
				break;
			}
		}
		
		if(start!=end){
			for(int i=start;i<=end;i++){
				if(list.get(i)==0){
					count++;
				}
			}
		}
		
		return count;
	}

}
