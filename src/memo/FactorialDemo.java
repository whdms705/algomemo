package memo;


/*
 * @Author : ����ȣ
 * @Date : 20180529
 * @Content : ����Լ��� ���丮�� ���� 
 */
public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));//5*4*3*2*1
	}
	
	public static int factorial(int n) {
		if(n==1) {//Defualt case
			return 1;
		}else {//Recursion case
			return n*factorial(n-1);
		}
	}

}
