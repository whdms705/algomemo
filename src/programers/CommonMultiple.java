package programers;

import java.util.Scanner;

/*
 * �ִ������� �ּҰ������ ���ϴ� �����Դϴ�.
 * ��Ŭ���� ȣ������ �����
 * 
 * */

public class CommonMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("2���� �� ���� �Է��Ͻÿ�!");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp1=(a>b)?a:b;
		int temp2=(a>b)?b:a;
		
		// �ִ�����
		int gcd=temp1%temp2;
		
		int lcm=0;
		if(gcd==0){
			// �ּҰ����
			lcm=(a*b)/1;
		}else{
			// �ּҰ����
			lcm=(a*b)/gcd;
		}
		
		
		
		System.out.println("�ִ����� : "+gcd+" �ּҰ���� : "+lcm);
		
	}

}
