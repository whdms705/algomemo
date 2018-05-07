package programers.level02;

public class Collatz {

	public int collatz(int num) {
		int answer = 0;
		int count = 0;
		
		while(true){
			if(num%2==0){
				num=num/2;
			}else{
				num=(num*3)+1;
			}
			count++;
			if(num==1){
				answer=count;
				break;
			}
			if(count==500){
				answer=-1;
				break;
			}
		}
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}

}
