package memo;

public class FibonacciPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(func(4));
	}
	
	public static Integer func(int n){
		if(n==0){
			return 0; 
		}else if(n==1){
			return 1;
		}else{
			return func(n-1)+func(n-2);
		}
		
		
	}

}
