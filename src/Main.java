
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("------ Menu ------");
        System.out.println("1. Thêm mới liên lạc.");
        System.out.println("2. Sửa thông tin liên lạc.");
        System.out.println("3. Xóa thông tin liên lạc.");
        System.out.println("4. Hiển thị danh sách liên lạc.");
        System.out.println("5. Tìm kiếm liên lạc theo mã liên lạc.");
        System.out.println();
        System.out.print("Mời bạn chọn chức nắng: ");


        // tạo cho người dùng nhập tay 1 số muốn chọn chức năng.
        Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();

        // tạo switch case để xử lý các chức năng.
        switch (choice){
            case 1:
                System.out.println("Bạn đã chọn thêm mới liên lạc.");
                System.out.println("Số lượng bạn muốn thêm: ");
                int contactNumber = sc.nextInt();
                addNewContact(contactNumber);
                break;
            case 2:
                System.out.println("Bạn đã chọn sửa thông tin liên lạc.");
                findExistingContact();
                break;
            case 3:
                System.out.println("Bạn đã chọn xóa thông tin liên lạc.");
                break;
            case 4:
                System.out.println("Bạn đã chọn hiển thị danh sách liên lạc.");
                showOurContacts();
                break;
            case 5:
                System.out.println("Bạn đã chọn tìm kiếm liên lạc theo mã liên lạc.");
                break;
            default:
                System.out.println("Cám ơn bạn đã dùng chương trình");
        }


    }



        //------------------Chức năng thêm thông tin-----------------------
    public static void addNewContact(int contactNumber){

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thông tin");
        for (int i = 0; i < contactNumber; i++){
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Họ và tên: ");
            String name = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Địa chỉ: ");
            String address = sc.nextLine();
            Contact.list.add(new Contact(id,name,phone,email,address));
        }
        System.out.println("Nhập thông tin thành công!!!!");
    }



    //------------------Chức năng show thông tin-----------------------
    public static void showOurContacts(){
        // kiểm trả xem trong listsize() có phần tử nào không , nếu có sẽ thự hiện show thônng tin, không thì sẽ trả kết quả là chưa có.
        Contact.list.add(new Contact(1,"John","0123456789","john@gmail.com","America"));
        Contact.list.add(new Contact(2,"Hào","0918777418","hao@gmail.com","Long An"));
        Contact.list.add(new Contact(3,"Tiến","0123123132","tien@gmail.com","Quận Tân Bình"));
        if (Contact.list.size() == 0){
            System.out.println("Chưa có thông tin liên lạc nào");
        } else {
            for (Contact showAll : Contact.list){
                System.out.println(showAll);
            }
        }


    }
    //------------------Chức năng edit thông tin-----------------------
    public static void findExistingContact(){
        // Cho ngươi dùng nhập vào id cần sửa info
        // kiểm trả id đó có trong listsize hay không , có thì tiến hành đổi thông tin , setName của Contact
        // không thì sẽ trả về chưa có id này tồn tại.

        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn ID mà bạn muốn sửa: ");
        int editingContactId = sc.nextInt();
        if (Contact.list.contains(editingContactId)){
            System.out.println("ID bạn chọn để sửa là: " + editingContactId);
            System.out.println("Nhập thông tin mới: ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Họ và tên: ");
            String name = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Địa chỉ: ");
            String address = sc.nextLine();


        }else
            System.out.println("ID bạn cần sửa không có !!!!");
    }

    public static void removeExistingContac(){
        // Kiểm trả ID có không , có sẽ tiến hành xóa theo vị trí của id đó
        // Không có id thì sẽ trả về id không tồn tại
    }


    public static void showFindingContact(){
        // Kiểm trả ID có không, có sẽ tiến hành xuất ra màn hình thông tin id đó
        // Không có id thì sẽ trả về id không tồn tại
    }
}