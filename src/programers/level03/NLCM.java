package programers.level03;

public class NLCM {

	public long nlcm(int[] num) {
		//{ 2, 6, 8, 14 };
		long answer = 0;
		
		int a = 24;
		int b = 14;
		
		int temp1=(a>b)?a:b;
		int temp2=(a>b)?b:a;
		
		// 최대공약수
		int gcd=temp1%temp2;
		
		int lcm=0;
		if(gcd==0){
			// 최소공배수
			lcm=(a*b)/1;
		}else{
			// 최소공배수
			lcm=(a*b)/gcd;
		}
		
		
		//최대공약수 : 0 최소공배수 : 12
		//최대공약수 : 6 최소공배수 : 18
		// 12 18  최대공약수 : 6 최소공배수 : 36
		
		System.out.println("최대공약수 : "+gcd+" 최소공배수 : "+lcm);
		
		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}

}
