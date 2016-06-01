import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteractRunner {

    public static InteractRunner interactRunner = new InteractRunner();
    private static Calculator calculator = new Calculator();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private void menu() throws IOException {
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Commit the calculation to the result");
        System.out.println("6 - Clear result");
        System.out.println("7 - Exit calculator");

        int choice =Integer.parseInt(br.readLine());

        switch (choice){
            case 1:
                System.out.println("Adding");
                System.out.println("Enter first number:");
                double a = Double.parseDouble(br.readLine());
                System.out.println("Enter second number:");
                double b = Double.parseDouble(br.readLine());
                calculator.add(a, b);
                System.out.println(a+" + "+b+" = "+calculator.getResult());
                break;
            case 2:
                System.out.println("Subtracting");
                System.out.println("Enter first number:");
                a = Double.parseDouble(br.readLine());
                System.out.println("Enter second number:");
                b = Double.parseDouble(br.readLine());
                calculator.sub(a, b);
                System.out.println(a+" - "+b+" = "+calculator.getResult());
                break;
            case 3:
                System.out.println("Multiplying");
                System.out.println("Enter first number:");
                a = Double.parseDouble(br.readLine());
                System.out.println("Enter second number:");
                b = Double.parseDouble(br.readLine());
                calculator.mult(a, b);
                System.out.println(a+" * "+b+" = "+calculator.getResult());
                break;
            case 4:
                System.out.println("Dividing");
                System.out.println("Enter first number:");
                a = Double.parseDouble(br.readLine());
                System.out.println("Enter second number:");
                b = Double.parseDouble(br.readLine());
                calculator.div(a, b);
                System.out.println(a+" / "+b+" = "+calculator.getResult());
                break;
            case 5:
                System.out.println("Result number is: "+calculator.getResult());
                System.out.println("Enter second number: ");
                b = Double.parseDouble(br.readLine());
                System.out.println("Choose the operation: + - / *");
                String operation = br.readLine();
                calculator.calc(operation, calculator.getResult(), b);
                System.out.println(calculator.getResult());
                break;
            case 6:
                calculator.setResult(0);
                System.out.println("Result is 0");
                break;
            case 7:
                System.exit(1);
                default:
                    System.out.println("No such number in menu, please choose correct number!");

        }
        interactRunner.menu();
    }

    public static void main(String[] args) throws IOException {
        interactRunner.menu();

    }




}
