import java.util.Scanner;

public class uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0||b == 0){
            System.out.println("No result");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("Result is: " + a);
    }

}
