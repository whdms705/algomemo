package programers;

import java.util.Scanner;

/*
 * content -  �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������. 
 * �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ
 * Level - easy
 * 
 * */

public class WordGetmiddleEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܾ �Է����ּ���!");
		String word=sc.nextLine();
		int word_length=word.length();
		int midValue=word_length/2;
		String result=null;
		
		
		if((word_length%2)==0)
		{
			result=word.substring(midValue-1, midValue+1);
			
		}
		
		if((word_length%2)==1)
		{
			result=word.substring(midValue, midValue+1);
			
		}
			
		
		
		
		
	}

}
