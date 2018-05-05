package programers.level03;

public class JumpCase {

	public int jumpCase(int num) {
        int answer = 0;
        if(num==1) {
        	answer=1;
        }else if(num==2) {
        	answer=2;
        }else {
        	int temp1=1,temp2=1;
	        for(int i=1;i<num;i++) {
	        	answer = temp1 + temp2;
	        	temp1=temp2;
	        	temp2=answer;
	        }
        }
System.out.println("answer : "+answer);
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }

}
