package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Content -  �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������. 
 * �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ
 * @Level - easy
 * @Athor - eunho
 * */
public class DivisibleArrayEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arrList = {5, 9, 7, 10};
		System.out.println("divisor ���� �Է��Ͻÿ�!");
		int divisor=sc.nextInt();
		int listLength=arrList.length;
		int resultSize=0;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<listLength;i++){
			if(arrList[i]%divisor==0){
				list.add(arrList[i]);
				resultSize++;
			}
		}
		
		int[] result = new int[resultSize];
		
		for(int i=0;i<resultSize;i++){
			result[i]=list.get(i);
		}
		
		System.out.println(result.toString());
		
		
		// java8�� �̿��� ��� 
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
        //return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
		
		
	}

}
