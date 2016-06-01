public class ArgRunner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[2]);
        String operation = args[1];
        calculator.calc(operation, first, second);
        System.out.println(calculator.getResult());
    }
}