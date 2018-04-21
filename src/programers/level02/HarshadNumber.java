package programers.level02;

public class HarshadNumber{
	public boolean isHarshad(int num){
		String temp = String.valueOf(num);
		String num1 = temp.substring(0,1);
		String num2 = temp.substring(1,2);
		int sum= 0;
		int len = temp.length();
		for(int i=0;i<len;i++){
			sum=sum+Integer.parseInt(temp.substring(i,i+1));
		}
		if(num%sum==0){
			return true;
		}
		return false;
	}
  
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}
