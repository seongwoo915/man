package BMI;

public class Project {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//제지방량 q, 체지방량w, 체지방률e ; 
		//제지방량계산공식
		// 남성표준 = (1.10*체중kg) - (128*(체중kg^2/키cm^2));
		//체지방률 계산공식
		//제지방률 
		//체지방율 = 100-제지방량%
		//남성 체충 = 75kg, 남성 키 = 175cm
		
		
		double ST1 = 1.10;
		int ST2 = 128;
		
		int weight = 75;
		int height = 175;
		double x1 = (ST1*weight);
		int ww = weight*weight;
		int hh = height*height;
		double q = (ST1*weight) - (ST2*(ww/hh)) ;
		System.out.println(q);
		
		//제지방량 (q) = 82.5kg;
		
		//체지방량kg = 체중kg - 제지방량kg
		
		double w = weight - q;
		
		System.out.println(w);
		//체지방량 (w)= -7.5;
	
		
		//체지방률 = (체지방량kg*100)/체중kg;
		
		double e = (w*100)/(weight);
		
		System.out.println(e);
		//체지방율(e) = -10.0
		
		
			
		
		
		
		
		
	}

}
