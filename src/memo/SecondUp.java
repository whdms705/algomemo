package memo;


//name_z
public class SecondUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		//String p1 = "PM 01:00:00";
		String p2 = "PM 11:59:59";
		//String p3 = "AM 12:10:00";
		int n = 10;
		int total = 0;
		
		String[] arr = p2.split(" ");
		String[] time = arr[1].split(":");
		
		total = (Integer.parseInt(time[0])*60*60)
				+(Integer.parseInt(time[1])*60)
				+(Integer.parseInt(time[2]));
		if(arr[0].contains("P")){
			total = total+(12*60*60);
		}
		
		total = total + n;
		
		System.out.println(convertSecondToTime(total));
		
	}
	
	public static String convertSecondToTime(int total){
		String h=null, m=null, s=null;
        StringBuilder sb = new StringBuilder();
        //�ð�����
        h = String.valueOf(total / 3600);//�� ����
		
		//���ڸ� �϶� 0���� ������ ó��
        if("24".equals(h)){
        	h="00";
        }
        if(h.length()<2){
        	h="0"+h;
        }
        sb.append(h);
        sb.append(":");
        
        m = String.valueOf(total % 3600 / 60);//���� ���ϱ����ؼ� �Էµǰ� ���������� �� 60�� ������.
        
        if(m.length()<2){
        	m="0"+m;
        }
        sb.append(m);
        sb.append(":");
        s = String.valueOf(total % 3600 % 60);
        
        
        if(s.length()<2){
        	s="0"+s;
        }
        sb.append(s);
        
        return sb.toString();
	}

}
