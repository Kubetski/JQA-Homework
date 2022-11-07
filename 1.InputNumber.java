import java.util.Scanner;
import java.lang.String;

public class InputNumber {

    public static void main(String[] args) {
        Scanner yourNumber1 = new Scanner(System.in);
        System.out.println("Моля, въведете число:");

        String numberTyped = yourNumber1.nextLine();
        System.out.println("Въведенето число е: " + numberTyped);

        Scanner yourNumber2 = new Scanner(System.in);
        System.out.println("Моля, въведете число:");

        String numberTyped2 = yourNumber2.nextLine();
        System.out.println("Въведенето число е: " + numberTyped2);

        Scanner yourNumber3 = new Scanner(System.in);
        System.out.println("Моля, въведете число:");

        String numberTyped3 = yourNumber3.nextLine();
        System.out.println("Въведенето число е: " + numberTyped3);

        int a = Integer.parseInt(numberTyped);
        int b = Integer.parseInt(numberTyped2);
        int c = Integer.parseInt(numberTyped3);
        {
            if (c < b && c > a) {
                System.out.println("Въведеното число е между предишните 2");
            } else  {
                System.out.println("Въведеното число не е между предишните 2");
        }
        }
        }

    }

