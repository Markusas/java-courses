public class Calculator {
    private double result;

    public void add(double a, double b) {
        this.result = a + b;

    }

    public void sub(double a, double b) {
        this.result = a - b;
    }

    public void mult(double a, double b) {
        this.result = a * b;

    }

    public void div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            this.result = a / b;
        }
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    void calc(String operation, double a, double b){
        if ("+".equals(operation)){
            this.add(a, b);
        }else if ("-".equals(operation)){
            this.sub(a, b);
        }else if ("*".equals(operation)){
            this.mult(a, b);
        }else if ("/".equals(operation)){
            this.div(a, b);
        }else {
            System.out.println("No such operator");
        }


    }
}
