package memo;

public class FactorialPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(func(5));
	}
	
	public static Integer func(int n){
		if(n<=0){
			return 1;
		}else{
			return n*func(n-1);
		}
	}

}
