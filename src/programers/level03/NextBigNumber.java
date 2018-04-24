package programers.level03;


/*
 * N�� ���� ū ���ڴ� N�� 2������ �ٲپ��� ���� 1�� ������ ���� ������ �̷���� ���Դϴ�.
1��° ������ �����ϴ� ���ڵ� �� N���� ū �� �߿��� ���� ���� ���ڸ� ã�ƾ� �մϴ�.
���� ���, 78�� 2������ �ٲٸ� 1001110 �̸�, 78�� ���� ū ���ڴ� 83���� 2������ 1010011 �Դϴ�.
N�� �־��� ��, N�� ���� ū ���ڸ� ã�� nextBigNumber �Լ��� �ϼ��ϼ���.
 */

public class NextBigNumber {
	
	public int nextBigNumber(int n)
    {
		String n2 = Integer.toBinaryString(n);
		int checkNum1 = lenCount(n2);
		int end = 1000000;
        int answer = 0;
        
        for(int i=n+1;i<=end;i++) {
        	if(checkNum1==lenCount(Integer.toBinaryString(i))) {
        		answer=i;
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextBigNumber test = new NextBigNumber();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
	}
	
	public static int lenCount(String n2) {
		String check=null;
		int count=0;
		for(int i=0;i<n2.length();i++) {
			check = n2.substring(i,i+1);
			if("1".equals(check)) {
				count++;
			}
		}
		return count;
	}

}
