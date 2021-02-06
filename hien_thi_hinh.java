

import java.util.Scanner;

public class hien_thi_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("-----------Menu-----------");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit program");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("Input length: ");
                    int length = scanner.nextInt();
                    System.out.println("Input width: ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("6. The corner is square at bottom_left ");
                    System.out.println("7. The corner is square at top_left ");
                    System.out.println("8. The corner is square at bottom_right ");
                    System.out.println("9. The corner is square at top_right ");
                    System.out.println("Enter your choice type of triangle:");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 6:
                            System.out.println("Enter the side:");
                            int side = scanner.nextInt();
                            for (int i = 0; i <= side; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case 7:
                            System.out.println("Enter the side:");
                            side = scanner.nextInt();
                            for (int i = 0; i < side; i++) {
                                for (int j = side; j > i; j--) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case 8:
                            System.out.println("Enter the side:");
                            side = scanner.nextInt();
                            for (int i = 0; i <= side; i++) {
                                for (int j = side; j > i; j--) {
                                    System.out.print("  ");
                                }
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 9:
                            System.out.println("Enter the side:");
                            side = scanner.nextInt();
                            for (int i = 0; i <= side; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("  ");
                                }
                                for (int j = side; j > i; j--) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the side:");
                    int side = scanner.nextInt();
                    for (int i = 0; i <= side; i++) {
                        for (int j = side; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");
            }
        }
    }
}