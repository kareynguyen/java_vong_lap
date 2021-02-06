import java.util.Scanner;

public class snt_nho_hon_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of prime number: ");
        int number = sc.nextInt();
        int N = 2;
        while (N < number) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}
