package kakao;

import java.util.Set;
import java.util.TreeSet;

/*
���̰� n�� �迭�� 1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ����� Ȯ���Ϸ��� �մϴ�.
1���� n���� ���ڰ� �ߺ� ���� �� ���� ��� �ִ� ��� true��, �ƴ� ��� false�� ��ȯ�ϵ��� �Լ� solution�� �ϼ����ּ���.

���ѻ���
�迭�� ���̴� 10�� �����Դϴ�.
�迭�� ���Ҵ� 10�� ������ �ڿ����Դϴ�.

����� �� ����
����� �� #1
�Է��� [4, 1, 3, 2]�� �־��� ���, �迭�� ���̰� 4�̹Ƿ� �迭���� 1���� 4���� ���ڰ� ��� ��� �־�� �մϴ�. [4, 1, 3, 2]���� 1���� 4������ ���ڰ� ��� ��� �����Ƿ� true�� ��ȯ�ϸ� �˴ϴ�.

����� �� #2
[4, 1, 3]�� �־��� ���, �迭�� ���̰� 3�̹Ƿ� �迭���� 1���� 3���� ���ڰ� ��� ��� �־�� �մϴ�. [4, 1, 3]���� 2�� ���� 4�� �����Ƿ� false�� ��ȯ�ϸ� �˴ϴ�.
*/



public class BeforehandPractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={4, 1, 3, 2};
		int num1=arr.length;
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<num1;i++){
			set.add(i+1);
		}
		
		for(int i : arr){
			set.remove(i);
		}
		
		if(set.size()==0){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
