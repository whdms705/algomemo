package programers;

import java.util.Scanner;

/*
 * content -  단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 
 * 단어의 길이가 짝수일경우 가운데 두글자를 반환
 * Level - easy
 * 
 * */

public class WordGetmiddleEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요!");
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
			
		
		System.out.println("결과 : "+result);
		
		// 아래와 같은 방식으로도 한줄로 처리 할 수 있음 
		//return word.substring((word.length()-1)/2, word.length()/2 + 1);  
		
	}

}
