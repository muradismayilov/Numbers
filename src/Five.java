import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        int y,z=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayi girin: ");
        int x = sc.nextInt();
        int m=x;
        while (x > 0) {
            y = x % 10;
            z = z * 10 + y;
            x = x / 10;
        }
        if (m == z) {
            System.out.println("Sayi polindromdur");
        } else System.out.println("Sayi polindrom deyil");
    }


}
