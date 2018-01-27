package stringHomeWork;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String enteredText=scanner.nextLine();

        if (isPalindrome(enteredText)){
            System.out.println("Введенная вами строка является палиндромом");
        }else {
            System.out.println("Введенная вами строка не является палиндромом");
        }
    }

    private static boolean isPalindrome(String enteredText) {
        StringBuilder builder=new StringBuilder()
                .append(enteredText);

        return (enteredText.equals((builder.reverse()).toString()));
    }
}
