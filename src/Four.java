public class Four {
    public static void main(String[] args) {


        int x = 587;
        int y, z = 0;
        while (x > 0) {
            y = x % 10;
            z = z * 10 + y;
            x = x / 10;
        }
        System.out.println(z);


    }
}
