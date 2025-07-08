import java.util.Scanner;
public class nationality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = input.nextInt();
        System.out.println("Enter your nationality :");
        String nationality = input.nextLine();
        if (age >= 18 && nationality.equalsIgnoreCase("Egyptian")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("not eligible");
        }
    }
}









