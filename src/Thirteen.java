public class Thirteen {
    public static void main(String[] args) {
        int x = 189; int z = 0;
        int a1 = x/100%10;
        int a2 = x/10%10;
        int a3 = x%10;
        if(a1>=a2&&a1>=a3){
            z = a1*100;
            if(a2>=a3){
               z= z+a2*10+a3;
            }else {
                z = z+a3*10+a2;
            }
        }else if(a2>=a1&&a2>=a3){
            z=a2*100;
            if(a3>=a1){
                z=z+a3*10+a1;
            }else{
                z=z+a1*10+a3;
            }
        }else{
            z=a3*100;
            if(a1>=a2){
               z=z+a1*10+a2;
            }else{
                z=z+a2*10+a1;
            }
        }
        System.out.println(z);
    }
}
