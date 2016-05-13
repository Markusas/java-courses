public class Calculator{
	private double result;
	
	public void add(double a, double b){
		this.result = a+b;
	}
	
	public void min(double a, double b){
		this.result = a-b;
	}
	
	public void div(double a, double b){
		this.result = a/b;
	}
	
	public void mult(double a, double b){
		this.result = a*b;
	}
	
	public void expand(double a, double b){
		this.result = a;
		for (int i=1; i!=b; ++i){
			this.result*=a;
		}
	}
	
	public double getResult(){
		return this.result;
	}
	
	public void clearResult(){
		this.result = 0;
	}
	
	Calculator(){
		this.result = 0;
	}
}