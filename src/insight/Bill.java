package insight;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills={1,2,5,10,20,50};
		System.out.println(pay(100,bills,6));
	}
	
	public static int pay(int money,int[] bills,int n){
		int count=0;
		int t;
		
		if(n==1){
			if(money%bills[0]==0){
				return 1;
			}
		}else{
			return 0;
		}
		
		t = money/bills[n-1];
		for(int i=0;i<=t;i++){
			count +=pay(money-bills[n-1]*i,bills,n-1);
		}
		return count;
		
	}

}
