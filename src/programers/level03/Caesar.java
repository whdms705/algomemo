package programers.level03;

/*
 * � ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.

A�� 3��ŭ �и� D�� �ǰ� z�� 1��ŭ �и� a�� �˴ϴ�. ������ �������� �ʽ��ϴ�.

���� ���ڿ� s�� �󸶳� ���� �˷��ִ� n�� �Է¹޾� ��ȣ���� ����� caesar �Լ��� �ϼ��� ������.

��a B z��,4�� �Է¹޾Ҵٸ� ��e F d���� �����մϴ�.
 * https://programmers.co.kr/learn/challenge_codes/22 
 */
public class Caesar {
	
	String caesar(String s, int n) {
		String result = s;
		// �Լ��� �ϼ��ϼ���.
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
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("NnBfwkN VPUuzpjVZJbng TuyklPvnJrewI BlyuulMFIKllDc",32));
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
