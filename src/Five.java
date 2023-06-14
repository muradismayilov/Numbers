public class Five {
    public static void main(String[] args) {

        int x = 4654;
        int b = x / 10 % 10;
        int c = x / 100 % 10;
        int e = x / 1000 % 10;
        int d = x % 10;
        if (d == e && b == c) {
            System.out.println("Sayi polindromdur");
        } else System.out.println("Sayi polindrom deyil");
    }
}
