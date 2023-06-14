public class Twelve {
    public static void main(String[] args) {
        int x = 324;
        int y;
        y= (int)Math.sqrt(x);
        if(y*y == x) {
            System.out.println(x+" in kvadrati " + y);
        }else {
            System.out.println("Hecneyin kvadrati deyil");
        }
    }
}
