public class ex21 {
    public static void main(String[] args) {
        System.out.println("so tu 0 den fff");
        for (int i=0; i<=0xFFFF;i++) {
            String hexstring = Integer.toHexString(i).toUpperCase();
            System.out.println(hexstring);
        }
    }
}
