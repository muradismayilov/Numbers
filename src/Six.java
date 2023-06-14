public class Six {
    public static void main(String[] args) {
        int x = 15689;
        int a5= x%10;
        int a4 = x/10%10;
        int a3 = x/100%10;
        int a2 = x/1000%10;
        int a1 = x/10000%10;
        if(a1<a2&&a2<a3&&a3<a4&&a4<a5){
            System.out.println("True");
        }else System.out.println("False");
    }
}
