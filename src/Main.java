import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter number1");
            while (!num.hasNextDouble()){
               System.out.println("Invalid input, enter number1");
               num.next();
            }
            double i = num.nextDouble();
            System.out.println("My number1 is=> " + i);
            System.out.println("Enter number2");
            while (!num.hasNextDouble()){
                System.out.println("Invalid input, enter number2");
                num.next();
            }
            double j = num.nextDouble();
            System.out.println("My number2 is=> " + j);
            num.nextLine();
            System.out.println("Enter operation");
            String symbols = num.nextLine();
            System.out.println("My operation is=> " + symbols);
            double result = 0;
            switch (symbols) {
                case "+":
                    result = i + j;
                    break;
                case "-":
                    result = i - j;
                    break;
                case "*":
                    result = i * j;
                    break;
                case "/":
                    if (j==0){
                        System.out.println("Error!");
                        System.out.println("Choose other value");
                    }
                    result = i / j;
                    break;
                default:
                    System.out.println("Unknown operation");
                    System.out.println("Available operation is=> + or - or * or /");
            }
            System.out.println("Result is: " + result);
            System.out.println("Continie? (y/n)");
            choice = num.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Calculator stopped");
    }
}