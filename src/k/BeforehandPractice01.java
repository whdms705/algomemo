package k;


/*�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���*/

public class BeforehandPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int answer = 0;
        
        String temp = String.valueOf(n);
        String t[]=temp.split("");
        for(String s : t){
            answer=answer+Integer.parseInt(s);
        }

		System.out.println("answer: "+answer);

	}

}
