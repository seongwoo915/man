package TypeExam2;

public class Exam03 {
	public static void main(String[] arags) {
		//ü���淮 ������
		//ü������ = ������ - ü���淮
		//����ǥ�� ü���淮 = (1.10*ü��kg) - (128*(ü��kg^2/Űcm^2))
		//ü�� 75kg, Ű 175cm �� �������� ǥ�� ü���淮�� ���Դϱ�.
		
		final double ST1 = 1.10;
		final int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		double x1 = ST1*weight;
		int ww = weight*weight;
		int hh = height*height;
		
		System.out.println("ww:" +ww);
		System.out.println("hh:" + hh);
		
		double w1 = (weght*weight)/(height*height);
		
		double w2 = ST2*w1;
		
		System.out.println("x1:" +x1);
		System.out.println("w1:" +w1);
		System.out.println("w2:" +w2);
		
		
		double result = ST1*weight - (ST2*((double)(weight*weight)/(height*height));
		
		System.out.println(result);
		
				
		
		
		
		
		
		
	}

}
