import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ts1, ms1, ts2, ms2;
        System.out.println("Nhập lần luot tử số mà mẫu số của 2 phân số: ");
        ts1 = sc.nextInt();
        ms1 = sc.nextInt();
        ts2 = sc.nextInt();
        ms2 = sc.nextInt();
        int ts = ts1 * ms2 + ts2 * ms1;
        int ms = ms1 * ms2;
        System.out.printf("Tổng 2 phân số đã cho là: %d/%d", ts, ms);
    }
}
