import java.util.ArrayList;

public class Contact {
    protected static ArrayList<Contact> list = new ArrayList<>();
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;

    public Contact(int id, String name, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }


    public void showContact(Contact showfullcontact) {
        System.out.println("ID: " + showfullcontact.getId());
        System.out.println("Name: " + showfullcontact.getName());
        System.out.println("Phone: " + showfullcontact.getPhone());
        System.out.println("Email: " + showfullcontact.getEmail());
        System.out.println("Address: " + showfullcontact.getAddress());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
