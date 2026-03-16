import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static String RandomString(int n)
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Sử dụng Random để lấy chỉ số ngẫu nhiên
        Random random = new Random();

        // StringBuilder giúp tối ưu hiệu năng khi nối chuỗi dài
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            // Lấy một vị trí ngẫu nhiên từ 0 đến độ dài của chuỗi characters - 1
            int index = random.nextInt(characters.length());

            // Lấy ký tự tại vị trí đó và thêm vào StringBuilder
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so chuoi can random: ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(n >= 1 && n <= 1000){
                String result = RandomString(n);
                System.out.println("Chuoi dc sinh ra: ");
                System.out.println(result);
            }
        }
    }
}
