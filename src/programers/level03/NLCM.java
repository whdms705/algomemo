package programers.level03;

public class NLCM {

	public long nlcm(int[] num) {
		//{ 2, 6, 8, 14 };
		long answer = 0;
		
		int a = 24;
		int b = 14;
		
		int temp1=(a>b)?a:b;
		int temp2=(a>b)?b:a;
		
		// �ִ�����
		int gcd=temp1%temp2;
		
		int lcm=0;
		if(gcd==0){
			// �ּҰ����
			lcm=(a*b)/1;
		}else{
			// �ּҰ����
			lcm=(a*b)/gcd;
		}
		
		
		//�ִ����� : 0 �ּҰ���� : 12
		//�ִ����� : 6 �ּҰ���� : 18
		// 12 18  �ִ����� : 6 �ּҰ���� : 36
		
		System.out.println("�ִ����� : "+gcd+" �ּҰ���� : "+lcm);
		
		return answer;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}

}
