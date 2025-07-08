import java.util.Scanner;
public class sentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence = input.nextLine();
        String UppercaseSentence = sentence.toUpperCase();
        int length = sentence.length();
        char firstCharacter = sentence.charAt(0);
        System.out.println("Uppercase =" + UppercaseSentence);
        System.out.println("length =" + length);
        System.out.println("first character =" + firstCharacter);

    }
}