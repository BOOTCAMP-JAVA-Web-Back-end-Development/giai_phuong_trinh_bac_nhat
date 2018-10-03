import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Đây là phương trình bậc nhất, hãy nhập vào các chỉ số a và b của phương trình ");
        System.out.println("Đây là phương trình bậc nhất, hãy nhập vào các chỉ số a: ");
        a = sc.nextFloat();
        System.out.println("Đây là phương trình bậc nhất, hãy nhập vào các chỉ số b: ");
        b = sc.nextFloat();
        if (a != 0) {
            float x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
