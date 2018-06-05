package memo;

import java.util.Scanner;

/*
 * @Author : ����ȣ
 * @Date : 20180529
 * @Content : ����Լ��� ���丮�� ���� 
 */
public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result=1;
		
		for(int i=num;i>0;i--) {
			result=result*factorial(i); // f = f(n-1)*n!
		}
		
		System.out.println(result);//3!*2!*1!
		
	}
	
	public static int factorial(int n) {
		if(n==1) {//Defualt case
			return 1;
		}else {//Recursion case
			return n*factorial(n-1);
		}
	}

}
