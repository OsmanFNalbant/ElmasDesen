import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz(Tek Sayı Olmak Zorunda):");
        int a = sc.nextInt();
        int b = a%2;
        if (a != b)
        {
            for (int i = 0; i <= a ; i++) {
                for (int j = 0; j < (a - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = 1; i <= a ; i++) {
                for (int j = (a-i); j < a; j++) {
                    System.out.print(" ");
                }
                for (int k = ((2*(a-i+1)-1)); k >=1 ; k--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
        else
        {
            System.out.println("Hatalı giris.");
        }
    }
}