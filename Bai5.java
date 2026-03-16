import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int choice;

        do {
            System.out.println("\n*********************************** MENU ***********************************");
            System.out.println("1. Nhập chuỗi");
            System.out.println("2. Đếm số ký tự thường, hoa, số, đặc biệt");
            System.out.println("3. Đảo ngược chuỗi");
            System.out.println("4. Kiểm tra Palindrome");
            System.out.println("5. Chuẩn hóa chuỗi (xóa khoảng trắng dư thừa, viết hoa chữ cái đầu)");
            System.out.println("6. Thoát");
            System.out.println("****************************************************************************");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập chuỗi: ");
                    input = sc.nextLine();
                    break;
                case 2:
                    countCharacters(input);
                    break;
                case 3:
                    System.out.println("Chuỗi đảo ngược: " + new StringBuilder(input).reverse());
                    break;
                case 4:
                    checkPalindrome(input);
                    break;
                case 5:
                    input = normalizeString(input);
                    System.out.println("Chuỗi sau khi chuẩn hóa: " + input);
                    break;
                case 6:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    // Chức năng 2: Đếm ký tự
    public static void countCharacters(String s) {
        int lower = 0, upper = 0, digits = 0, special = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lower++;
            else if (Character.isUpperCase(c)) upper++;
            else if (Character.isDigit(c)) digits++;
            else special++;
        }
        System.out.println("Ký tự thường: " + lower);
        System.out.println("Ký tự hoa: " + upper);
        System.out.println("Chữ số: " + digits);
        System.out.println("Ký tự đặc biệt: " + special);
    }

    // Chức năng 4: Kiểm tra Palindrome
    public static void checkPalindrome(String s) {
        if (s.isEmpty()) {
            System.out.println("Chuỗi trống!");
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(reversed)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải Palindrome.");
        }
    }

    // Chức năng 5: Chuẩn hóa chuỗi
    public static String normalizeString(String s) {
        if (s == null || s.isEmpty()) return s;

        // 1. Xóa khoảng trắng dư thừa đầu cuối và giữa các từ
        s = s.trim().replaceAll("\\s+", " ");

        // 2. Viết hoa chữ cái đầu, các ký tự khác giữ nguyên như yêu cầu
        if (s.length() > 0) {
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
        }
        return s;
    }
}
