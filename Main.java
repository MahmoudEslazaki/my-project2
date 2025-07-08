import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.println("Enter second number : ");
        double num2 = input.nextDouble();
        double sum =num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double Quotient = num1 / num2;
        System.out.println("sum = " + sum);
        System.out.println("difference =" + difference);
        System.out.println("product =" + product);
        System.out.println("Quotuent =" + Quotient);

    }
}