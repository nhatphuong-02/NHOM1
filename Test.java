import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Book b = new Book("s01", "Khong Gia Dinh", "Hector Malot", 1878 , 20);
        Scanner sc = new Scanner(System.in);

        b.displayInfo();

        System.out.print("Nhap ma sach: ");
        b.setBookId(sc.nextLine());
        System.out.print("Nhap tieu de sach: ");
        b.setTitle(sc.nextLine());
        System.out.print("Nhap ten tac gia: ");
        b.setAuthor(sc.nextLine());
        System.out.print("Nhap nam xuat ban: ");
        b.setPublicationYear(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap so luong sach: ");
        b.setQuantity(Integer.parseInt(sc.nextLine()));
        b.displayInfo();
        sc.close();
    }
}
