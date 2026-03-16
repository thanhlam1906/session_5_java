import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai3 {
    public static void main(String[] args) {
        Pattern p;
        Matcher m;
//        Viết chương trình Java để kiểm tra tính hợp lệ của một mật khẩu. Mật khẩu hợp lệ phải thỏa mãn các yêu cầu sau:
//        Ít nhất 8 ký tự
//        Có ít nhất một chữ cái viết hoa
//        Có ít nhất một chữ cái viết thường
//        Có ít nhất một ký tự số
//        Có ít nhất một ký tự đặc biệt (ví dụ: @, #, $, !, %)
        p= Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Scanner sc = new Scanner(System.in);
        String pw;
        System.out.print("Nhap mat khẩu: ");
        pw = sc.nextLine();
        m = p.matcher(pw);
        if (m.find()) {
            System.out.println("Mật khẩu hợp lệ");

        }else{
            System.out.println("Mật khẩu không hợp lệ");
        }
    }
}
