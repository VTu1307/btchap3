public class ex15 {
    public static void main(String[] args) {
        for (int i=0;i<4;i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("   ");
            }
           for (int k=1;k<=i*2+1;k++) {
               System.out.print("*  ");
           }
           System.out.println();
        }
        for (int t=0;t<2;t++) {
            System.out.print("   ");
        }
            for (int m = 0; m < 5; m++) {
                System.out.print("*  ");
            }


    }
}
