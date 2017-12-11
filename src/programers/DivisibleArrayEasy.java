package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Content -  단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 
 * 단어의 길이가 짝수일경우 가운데 두글자를 반환
 * @Level - easy
 * @Athor - eunho
 * */
public class DivisibleArrayEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arrList = {5, 9, 7, 10};
		System.out.println("divisor 수를 입력하시오!");
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
		
		
		// java8을 이용한 방식 
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        //return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
		
		
	}

}
