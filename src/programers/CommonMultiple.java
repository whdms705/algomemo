package programers;

import java.util.Scanner;

/*
 * 최대공약수와 최소공배수를 구하는 문제입니다.
 * 유클리드 호제법을 사용함
 * 
 * */

public class CommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("2가지 의 수를 입력하시오!");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp1=(a>b)?a:b;
		int temp2=(a>b)?b:a;
		
		// 최대공약수
		int gcd=temp1%temp2;
		
		int lcm=0;
		if(gcd==0){
			// 최소공배수
			lcm=(a*b)/1;
		}else{
			// 최소공배수
			lcm=(a*b)/gcd;
		}
		
		
		
		System.out.println("최대공약수 : "+gcd+" 최소공배수 : "+lcm);
		
	}

}
