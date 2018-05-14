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
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}
	
   //��Ŭ���� ȣ�������� �ִ����� ���ϱ�
   public static long gcd(long p, long q)
    {
      if (q == 0) return p;
      return gcd(q, p%q);
    }
   
   public static long lcm(long a,long b){
	   long temp1=(a>b)?a:b;
	   long temp2=(a>b)?b:a;
		
		// �ִ�����
	   long gcd=gcd(temp1, temp2);
		
		long lcm=0;
		if(gcd==0){
			// �ּҰ����
		    lcm=(long)(a*b)/1;
		}else{
			// �ּҰ����
			lcm=(long)(a*b)/gcd;
		}
		return lcm;
   }

}
