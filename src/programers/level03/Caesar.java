package programers.level03;

/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.

A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.

보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 caesar 함수를 완성해 보세요.

“a B z”,4를 입력받았다면 “e F d”를 리턴합니다.
 * https://programmers.co.kr/learn/challenge_codes/22 
 */
public class Caesar {
	
	String caesar(String s, int n) {
		String result = s;
		// 함수를 완성하세요.
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			sb.append(convert(str[i],n));
			if(i!=str.length-1) {
				sb.append(" ");
			}
		}
		result = sb.toString();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("NnBfwkN VPUuzpjVZJbng TuyklPvnJrewI BlyuulMFIKllDc",32));
	}
	
	public static String convert(String c,int n) {
		int leng = c.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<leng;i++){
			
			char ch1 = c.charAt(i);//java String to char
			int num=(int)ch1+n;
			
			if (Character.isUpperCase(ch1) == true) {
		      if(num>90) {
		    	  num=65+(num-90-1);
		      }
		      
		  }else if (Character.isLowerCase(ch1) == true) {
		      if(num>122) {
		    	  num=97+(num-122-1);
		      }
		      
		  } 
			
			
			char ch2 = (char)num;
			sb.append(ch2);
		}		
		return sb.toString();
	}

}
