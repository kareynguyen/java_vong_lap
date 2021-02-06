import java.util.Scanner;
public class hienthi_snt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of prime number: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            boolean check=true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N%i == 0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.println(N);
                count++;
            }N++;
        }
    }
}