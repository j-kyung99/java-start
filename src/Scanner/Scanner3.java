package Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 수: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " > " + num2);
        } else if (num2 > num1) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }
    }
}
