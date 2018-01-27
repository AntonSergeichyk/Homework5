package stringHomeWork;

public class Example2 {
    public static void main(String[] args) {
        String romeNumber = "MMMMDCCCXCIX";
        System.out.println(romeToArab(romeNumber));
    }

    private static int romeToArab(String romeNumber) {
        int result = 0;
        if (romeNumber.length()%2!=0){
            result+=getArabNumber(romeNumber.charAt(0));
        }

        for (int i = romeNumber.length() - 1; i > 0; i--) {
            int secondNumber = getArabNumber(romeNumber.charAt(i - 1));
            int firstNumber = getArabNumber(romeNumber.charAt(i));

            if (firstNumber > secondNumber) {
                result += firstNumber - secondNumber;
            } else {
                result += firstNumber + secondNumber;
            }
            i--;
        }

        return result;
    }

    private static int getArabNumber(char c) {
        int number = 0;
        if (c == 'I') {
            number = 1;
        }
        else if (c == 'V') {
            number = 5;
        }
        else if (c == 'X') {
            number = 10;
        }
        else if (c == 'L') {
            number = 50;
        }
        else if (c == 'C') {
            number = 100;
        }
        else if (c == 'D') {
            number = 500;
        }
        else if (c == 'M') {
            number = 1000;
        }
        return number;
    }
}
