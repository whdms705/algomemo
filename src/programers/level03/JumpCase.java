package programers.level03;

public class JumpCase {

	public int jumpCase(int num) {
        int answer = 0;
        if(num<=1) {
        	answer=num;
        }else {
        	int temp1=1,temp2=1;
	        for(int i=1;i<num;i++) {
	        	answer = temp1 + temp2;
	        	temp1=temp2;
	        	temp2=answer;
	        }
        }

        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.jumpCase(testCase));
    }

}
