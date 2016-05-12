public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate..");
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		double sum = first + second;
		double min = first - second;
		double mult = first * second;
		double div = first / second;
		System.out.println("Sum(+) = "+sum);
		System.out.println("Min(-) = "+min);
		System.out.println("Mult(*) = "+mult);
		System.out.println("Div(/) = "+div);
		
	}
}