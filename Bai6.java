import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<String> list = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n*********************************** MENU ***********************************");
            System.out.println("1.Nhập ten sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim ten sinh vien chua tu khoa");
            System.out.println("4. Dem so sinh vien bat dau tu chu cai nhap vao");
            System.out.println("5. Sap xep theo thu tu tu A-Z)");
            System.out.println("6. Thoát");
            System.out.println("****************************************************************************");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.print("them ten sinh vien: ");
                    input = sc.nextLine();
                    list.add(input);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien la: ");
                    for (String name : list){
                        System.out.println(name);
                    }
                    break;
                case 3:
                    String name;
                    System.out.print("Nhap tu khoa can tim kiem la: " );
                    name =  sc.nextLine();
                    System.out.println("Danh sach sinh vien theo tu khoa la: ");
                    for ( String s : list){
                       if (s.toLowerCase().contains(name)){
                           System.out.println(s);
                       }
                    }
                    break;
                case 4:
                    System.out.print("Nhập chữ cái bắt đầu: ");
                    String prefix = sc.nextLine();
                    long count = list.stream()
                            .filter(s -> s.toLowerCase().startsWith(prefix.toLowerCase()))
                            .count();
                    System.out.println("Có " + count + " sinh viên bắt đầu bằng '" + prefix + "'");
                    break;
                case 5:
                    Collections.sort(list); // Sắp xếp danh sách
                    System.out.println("Đã sắp xếp danh sách từ A-Z.");
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
            }
        }while (choice != 6);

    }
}
