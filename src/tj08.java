
public class tj08 {

	public static void main(String[] args) {

		
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val) || Double.isInfinite(val)) {
			System.out.println("산출불가");
			
			val = 0.0;
		}
		
		
		currentBalance += val;
		System.out.println(currentBalance);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
