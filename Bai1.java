import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {
    public static void main(String[] args) {
       // Loại bỏ những khoảng trăng thừa
       // Kiểm tra chuỗi có đúng định dạng email không
        Pattern p;
        Matcher m;

        // tạo pattern
        p = Pattern.compile("^[a-zA-Z][._\\w]*@\\w{3,}.w{2,5}(.\\{2,5}?$)");

        String email;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email cân kiểm tra: ");
        email = sc.nextLine();

        m = p.matcher(email);
        if(m.find()) {
            System.out.print("Email này hợp lệ");

        }else {
            System.out.print("Email này không hợp lệ");
        }
    }
}
