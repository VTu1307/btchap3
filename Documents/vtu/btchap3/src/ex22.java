public class ex22 {
    public static void main(String[] args) {
        System.out.println("so tu 0 den 777 theo he bac phan");
        for (int i=0;i<=0x1FF;i++) {
            String octalstring = Integer.toOctalString(i);
            System.out.println(octalstring);
        }
    }
}
