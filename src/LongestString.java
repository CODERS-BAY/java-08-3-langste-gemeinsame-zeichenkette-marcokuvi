
import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        CommonString commonString = new CommonString();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first String?");
        String firstString = input.nextLine();
        System.out.println("What is your second String");
        String secondString = input.nextLine();
        System.out.println(commonString.getLongestCommonString(firstString, secondString));
    }
}
