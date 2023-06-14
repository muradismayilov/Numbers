public class Fourteen {
    public static void main(String[] args) {
        int x = 287; int z = 0;
        int a1 = x/100%10;
        int a2 = x/10%10;
        int a3 = x%10;

        if(a1<=a2&&a1<=a3){
           z=a2*10+a3;
        } else if (a2<=a3&&a2<=a1) {
            z=a1*10+a3;

        }else{

            z=a1*10+a2;
        }
        System.out.println(z);
    }
}
