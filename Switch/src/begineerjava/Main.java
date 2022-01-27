package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter digit =");
        digit= input.nextInt();
        switch (digit) {
            case 0: {
                System.out.println("Zero");
            }

            case 1: {
                System.out.println("One");
                break;
            }
            case 2: {
                System.out.println("two");
                break;
            }
            case 3: {
                System.out.println("Three");
                break;
            }
            case 4: {
                System.out.println("four");
                break;
            }
            case 5: {
                System.out.println("Five");
                break;
            }
            case 6: {
                System.out.println("Six");
                break;
            }

            case 7: {
                System.out.println("Seven");
                break;
            }
            case 8: {
                System.out.println("Eight");
                break;
            }
            case 9: {
                System.out.println("Nine");
                break;
            }
            default:
            {
                System.out.println("Not a digit");
            }
        }

    }
}
