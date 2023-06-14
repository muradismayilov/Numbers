

public class Eight {
    public static void main(String[] args) {
        boolean bool= true;
        int [] ar= new int[4];

        int x = 1356;
        int y, z = 0,a=x;
        while (x > 0) {
            y = x % 10;
           ar[z]=y;

            x = x / 10;
            z++;
        }
        for(int i=0;i<ar.length;i++){
            if (a % ar[i] !=0){
                bool = false;
                break;
            }
        }
        System.out.println("Verilmis reqem butun ededlerine bolunur? "+bool);
    }
}
