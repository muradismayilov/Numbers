public class Ten {
    public static void main(String[] args) {

        int x = 102, y = 91;
        int temp1 = (x + y) / 2, temp2 = (x + y) * 2;
        if (x > y) {

            y = temp1;
            x = temp2;
            System.out.println("kicik y dir " + y + " Boyuk x dir " + x);
        } else {
            x = temp1;
            y = temp2;
            System.out.println("kicik x dir " + x + " Boyuk y dir " + y);
        }
    }
}
