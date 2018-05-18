package memo;

import java.util.stream.Stream;

//name_z
public class OddSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String example ="ab2v9bc13j5jk4kk";
		String example ="10";
		
		boolean temp = false;
		StringBuilder sb =new StringBuilder();
		char[] arr = example.toCharArray();
		int sum = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			int inputValue = arr[i];	// ASCII 값을 비교하기 위해 저장
			if (inputValue>47 && inputValue<58)	// 숫자값일때
				{
					if(temp==true) {
						sb.append(String.valueOf(arr[i]));
					}else {
						sb.append(' '+String.valueOf(arr[i]));
					}
					temp = true;
				}
			else
				{
					temp = false;
				}
		}
		
		String[] result = sb.toString().trim().split(" ");
		for(String s : result) {
			int number = Integer.parseInt(s);
			if((number%2)!=0) {
				sum+=Math.pow(number, 2);
			}
		}
		
		System.out.println("sum : "+sum);
		
		
		
		//num.02 method

	}

}
