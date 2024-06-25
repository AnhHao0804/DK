import java.util.ArrayList;
import java.util.Scanner;
public class ContactManager {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Contact> list = new ArrayList<>();
    public static void addNewContact(int contactNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thông tin");
        for (int i = 0; i < contactNumber; i++) {
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
            list.add(new Contact(id, name, phone, email, address));
        }
        System.out.println("Nhập thông tin thành công!!!!");
    }
    public static void showOurContacts() {
        if (list.isEmpty()) {
            System.out.println("Chưa có thông tin liên lạc nào");
        } else {
            for (Contact showAll : list) {
                System.out.println(showAll);
            }
        }
    }
    public static void editingContactId() {
        System.out.println("Chọn ID mà bạn muốn sửa: ");
        int findId = sc.nextInt();
        sc.nextLine();
        Contact editContact = findExistingContact(findId);
        if (editContact != null) {
            System.out.println("ID bạn chọn để sửa là: " + findId);
            System.out.println("Nhập thông tin mới: ");
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
            System.out.println("Thay đổi thành công");
            editContact.setId(id);
            editContact.setName(name);
            editContact.setPhone(phone);
            editContact.setEmail(email);
            editContact.setAddress(address);
        } else
            System.out.println("ID bạn cần sửa không có !!!!");
    }
    public static void removeExistingContac(){
        System.out.println("Nhập số ID của bạn cần xóa: ");
        int removeId = sc.nextInt();
        Contact remove = findExistingContact(removeId);
        if (remove != null) {
            list.remove(remove);
            System.out.println("Xóa thành công");
        }else
            System.out.println("Không có ID");
    }
    public static void showFindingContact(){
        System.out.println("Nhập số ID cần tìm: ");
        int find = sc.nextInt();
        Contact findId = findExistingContact(find);
        if (findId != null){
            System.out.println("ID bạn cần tìm là: " + find);
            System.out.println(findId.toString());
        }else
            System.out.println("Không có ID");
    }
    public static Contact findExistingContact(Integer id){

        for (Contact contact : list) {
            Integer contactId = contact.getId();
            if (contactId.equals(id)) {
                return contact;
            }
        }
        return null;
    }
}

