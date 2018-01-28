package memo;


/*
 * ���� �ٰ� �밢���� ��ġ�� �ʰ� ��� level�� ��ġ�� �� �ִ��� 
 * infrun - recursion - N Queen Counting  
 * ����ȣ
 */

public class QueensCount {
	
	private static int n=4;
	private static int[] cols =new int[n+1]; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(queen(0));
	}
	
	public static boolean queen(int level){
		if(!promising(level)){
			return false;
		}else if(level==n){
			for(int i=1;i<=n;i++){
System.out.println("("+i+" , "+cols[i]+")");
			}
			return true;
		}
		
		for(int i=1; i<=n; i++){
			cols[level+1] = i;
			if(queen(level+1)){
				return true; 
			}
		}
		return false;
	}
	
	public static boolean promising(int level){
		for(int i=0;i<level;i++){
			if(cols[i]==cols[level]){
				return false;
			}else if(level-i==Math.abs(cols[level]-cols[i])){
				return false;
			}
		}
		return true;
	}

}
