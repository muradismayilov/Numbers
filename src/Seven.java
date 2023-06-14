

public class Seven {
    public static void main(String[] args) {
        boolean bool= false;
        int x = 1221;
        int a4= x%10;
        int a3 = x/10%10;
        int a2 = x/100%10;
        int a1 = x/1000%10;
       if(a1==a2&&(a1==a3||a1==a4)){
           bool=true;
        } else if (a2==a3&&(a2==a1||a2==a4)) {
           bool=true;
       } else if (a1==a4&&(a2==a1||a3==a1)) {
           bool=true;
       }else if (a1==a3&&(a2==a1||a4==a1)) {
           bool=true;
       }

        System.out.println(bool);
    }


}
