package BMI;

public class Project {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//�����淮 q, ü���淮w, ü�����e ; 
		//�����淮������
		// ����ǥ�� = (1.10*ü��kg) - (128*(ü��kg^2/Űcm^2));
		//ü����� ������
		//������� 
		//ü������ = 100-�����淮%
		//���� ü�� = 75kg, ���� Ű = 175cm
		
		
		double ST1 = 1.10;
		int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		double x1 = (ST1*weight);
		int ww = weight*weight;
		int hh = height*height;
		double q = (ST1*weight) - (ST2*(ww/hh)) ;
		System.out.println(q);
		
		//�����淮 (q) = 82.5kg;
		
		//ü���淮kg = ü��kg - �����淮kg
		
		double w = weight - q;
		
		System.out.println(w);
		//ü���淮 (w)= -7.5;
	
		
		//ü����� = (ü���淮kg*100)/ü��kg;
		
		double e = (w*100)/(weight);
		
		System.out.println(e);
		//ü������(e) = -10.0
		
		
			
		
		
		
		
		
	}

}
