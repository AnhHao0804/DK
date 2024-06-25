import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean cont = true;
       do {
           System.out.println("------ Menu ------");
           System.out.println("1. Thêm mới liên lạc.");
           System.out.println("2. Sửa thông tin liên lạc.");
           System.out.println("3. Xóa thông tin liên lạc.");
           System.out.println("4. Hiển thị danh sách liên lạc.");
           System.out.println("5. Tìm kiếm liên lạc theo mã liên lạc.");
           System.out.println("6. Thoát ứng dụng.");
           System.out.println("--------------------------------");
           System.out.print("Mời bạn chọn chức nắng: ");
           Scanner sc = new Scanner(System.in);
           int choice = sc.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("Bạn đã chọn thêm mới liên lạc.");
                   System.out.println("Số lượng bạn muốn thêm: ");
                   int contactNumber = sc.nextInt();
                   ContactManager.addNewContact(contactNumber);
                   break;
               case 2:
                   System.out.println("Bạn đã chọn sửa thông tin liên lạc.");
                   ContactManager.editingContactId();
                   break;
               case 3:
                   System.out.println("Bạn đã chọn xóa thông tin liên lạc.");
                   ContactManager.removeExistingContac();
                   break;
               case 4:
                   System.out.println("Bạn đã chọn hiển thị danh sách liên lạc.");
                   ContactManager.showOurContacts();
                   break;
               case 5:
                   System.out.println("Bạn đã chọn tìm kiếm liên lạc theo mã liên lạc.");
                   ContactManager.showFindingContact();
                   break;
               case 6:
                   System.out.println("Cám ơn bạn đã dùng chương trình");
                   cont = false;
                   break;
               default:
                   break;
           }
       } while (cont);
    }
}