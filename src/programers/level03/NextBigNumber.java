package programers.level03;


/*
 * N의 다음 큰 숫자는 N을 2진수로 바꾸었을 때의 1의 개수와 같은 개수로 이루어진 수입니다.
1번째 조건을 만족하는 숫자들 중 N보다 큰 수 중에서 가장 작은 숫자를 찾아야 합니다.
예를 들어, 78을 2진수로 바꾸면 1001110 이며, 78의 다음 큰 숫자는 83으로 2진수는 1010011 입니다.
N이 주어질 때, N의 다음 큰 숫자를 찾는 nextBigNumber 함수를 완성하세요.
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
