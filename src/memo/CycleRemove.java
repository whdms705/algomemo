package memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;// ���
		int d; // ����   >> 1:�ð���� , 0:�ݽð����
		int k,j;// ��ŭ �̵�
		//System.out.println("������� �����Ѱ���?");
		n=sc.nextInt();
		//System.out.println("������ �Է��Ͻÿ�");
		d=sc.nextInt();
		//System.out.println("k,j�Է�");
		k=sc.nextInt();
		j=sc.nextInt();
		solution(n,d,k,j);
	}
	
	public static void solution(int n,int d,int k,int j){
		System.out.println("----");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(0);
		}
		
		for(int i : list){
			System.out.println(">> "+i);
		}
		
		
		
		
		
		
	}

}
