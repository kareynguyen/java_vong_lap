import java.util.Scanner;

public class tienGui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double rate = 1.0;
        System.out.println("Enter money");
        money = sc.nextDouble();
        System.out.println("Enter month");
        month = sc.nextInt();
        System.out.println("Enter rate");
        rate = sc.nextDouble();
        double total = 0;
        for (int i=0; i<month; i++){
            total += money * (rate/100)/12 * month;
        }
        System.out.println("Total is: " + total);
    }
}
