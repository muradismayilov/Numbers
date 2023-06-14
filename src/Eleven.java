public class Eleven {

    public static void main(String[] args) {
        int x = 2478965;
        int y, z = 0;
        while (x > 0) {
            y = x % 10;
            if (y%2!=0){
                z = z * 10 + y;
            }
            x = x / 10;
        }
        while (z > 0) {
            y = z % 10;
            x = x * 10 + y;
            z = z / 10;
        }
        System.out.println(x);


    }
}
