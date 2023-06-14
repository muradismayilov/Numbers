public class Three {

    public static void main(String[] args) {

        int x = 789;
        int b = x/10%10;
        int c = x/100%10;
        int d= x%10;
        System.out.println("Reqemlerin cemi = " + (b+c+d));
        System.out.println("Reqemlerin hasili = " + (b*c*d));

    }
}
