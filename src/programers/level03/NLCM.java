package programers.level03;

public class NLCM {

	public long nlcm(int[] num) {
		//{ 2, 6, 8, 14 };
		long answer = 0;
		
		int a = num[0];
		int b = num[1];
		answer = lcm(a,b);
		if(num.length>2){
			for(int i=2;i<num.length;i++){
				answer=lcm(answer,num[i]);
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 24, 13, 46, 98, 42, 52, 76, 30, 25, 100 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
	
   //유클리드 호제법으로 최대공약수 구하기
   public static long gcd(long p, long q)
    {
      if (q == 0) return p;
      return gcd(q, p%q);
    }
   
   public static long lcm(long a,long b){
	   long temp1=(a>b)?a:b;
	   long temp2=(a>b)?b:a;
		
		// 최대공약수
	   long gcd=gcd(temp1, temp2);
		
		long lcm=0;
		if(gcd==0){
			// 최소공배수
		    lcm=(long)(a*b)/1;
		}else{
			// 최소공배수
			lcm=(long)(a*b)/gcd;
		}
		return lcm;
   }

}
