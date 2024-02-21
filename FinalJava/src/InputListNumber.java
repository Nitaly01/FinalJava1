import java.util.Scanner;

public class InputListNumber {
    static Scanner scanner = new Scanner(System.in);
    static int[] numbers = new int[10];
    static int count = 0;

    public static void Input() {
        System.out.print("Input numbers or Input negative number to stop inputting: ");
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input >= 0) {
                if (count == numbers.length) {
                    int newSize = numbers.length * 2;
                    int[] newNumbers = new int[newSize];
                    for (int i = 0; i < numbers.length; i++) {
                        newNumbers[i] = numbers[i];
                    }
                    numbers = newNumbers;
                }
                System.out.print("Input numbers or Input negative number to stop inputting: ");
                numbers[count++] = input;
            } else {
                break;
            }
        }
    }
    public static void View() {
        System.out.println("Numbers Input :");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Option :");
            System.out.println("1. Input Int Numbers");
            System.out.println("2. View Input Numbers");
            System.out.println("3. Exit");
            System.out.print("Input choice : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Input();
                    break;
                case 2:
                    View();
                    break;
                case 3:
                    System.out.println("(^-^) Good bye (^-^) ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose again.");
            }
        } while (true);
    }
}

