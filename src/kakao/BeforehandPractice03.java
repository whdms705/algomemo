package kakao;

import java.util.Set;
import java.util.TreeSet;

/*���簢���� ����� �� �ʿ��� 4���� �� �� 3���� ��ǥ�� �־��� ��, ������ �� ���� ��ǥ�� ���Ϸ��� �մϴ�. �� 3���� ��ǥ�� ����ִ� �迭 v�� �Ű������� �־��� ��, ���簢���� ����� �� �ʿ��� ������ �� ���� ��ǥ�� return �ϵ��� solution �Լ��� �ϼ����ּ���. ��, ���簢���� �� ���� x��, y�࿡ �����ϸ�, �ݵ�� ���簢���� ���� �� �ִ� ��츸 �Է����� �־����ϴ�.

���ѻ���
v�� �� ���� ��ǥ�� ����ִ� 2���� �迭�Դϴ�.
v�� �� ���Ҵ� ���� ��ǥ�� ��Ÿ����, ��ǥ�� [x�� ��ǥ, y�� ��ǥ] ������ �־����ϴ�.
��ǥ���� 1 �̻� 10�� ������ �ڿ����Դϴ�.
���簢���� ����� �� �ʿ��� ������ �� ���� ��ǥ�� [x�� ��ǥ, y�� ��ǥ] ������ ��� return ���ּ���.*/


public class BeforehandPractice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] v= {{1, 4}, {3, 4}, {3, 10}};
		int[] answer = new int[2];
		Set<Integer> x=new TreeSet<Integer>();
		Set<Integer> y=new TreeSet<Integer>();
		
		System.out.println(v.length);
		for(int i=0;i<v.length;i++){
			if(!x.contains(v[i][0])){
				x.add(v[i][0]);
			}else{
				x.remove(v[i][0]);
			}
		}
		
		for(int i=0;i<v.length;i++){
			if(!y.contains(v[i][1])){
				y.add(v[i][1]);
			}else{
				y.remove(v[i][1]);
			}
		}
		String xt=x.toString().replace("[", "").replace("]", "");
		String yt=y.toString().replace("[", "").replace("]", "");
		int xv=Integer.parseInt(xt);
		int yv=Integer.parseInt(yt);
		answer[0]=xv;
		answer[1]=yv;
		
		System.out.println(answer[0]+" / "+answer[1]);

	}

}
