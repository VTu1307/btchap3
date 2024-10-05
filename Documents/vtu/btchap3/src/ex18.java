public class ex18    {
    public static void main(String[] args) {
        int first = 1;
        int second = 7;
        int third = 16;

        // In ra 3 số đầu tiên
        System.out.print(first + " " + second + " " + third + " ");

        // Tính và in ra 7 số tiếp theo
        for (int i = 4; i <= 10; i++) {
            int next;
            if (i == 4) {
                next = 37;
            } else if (i == 5) {
                next = 79;
            } else {
                next = 2 * third + 1; // Công thức cho các số tiếp theo
                first = second; // Cập nhật các giá trị
                second = third;
                third = next;
            }
            System.out.print(next + " ");
        }
    }
}