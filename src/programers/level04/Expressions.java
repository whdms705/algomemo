package programers.level04;

public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		int sum = 0;
		int check = 1;
		
		for(int i=1;i<=num;i++) {
			if(num==0 || num==1) {
				answer=1;
				break;
			}
			sum+=i;
			if(sum==num) {
				i=check++;
				sum=0;
				answer++;
			}
			if(sum>num) {
				i=check++;
				sum=0;
			}
		}
System.out.println(answer);
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}

}
