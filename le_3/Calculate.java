public class Calculate{
	public static void main(String[] args){
		Calculator calc = new Calculator();
		System.out.println("Calculate..");
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		calc.add(first, second);
		System.out.println("Sum(+) = "+calc.getResult());
		
		calc.min(first, second);
		System.out.println("Min(-) = "+calc.getResult());
		
		calc.mult(first, second);
		System.out.println("Mult(*) = "+calc.getResult());
		
		calc.div(first, second);
		System.out.println("Div(/) = "+calc.getResult());		
		
		calc.clearResult();
		
	}
}