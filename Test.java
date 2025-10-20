import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BookManage list = new BookManage();
        Book b = new Book("s01", "Khong Gia Dinh", "Hector Malot", 1878 , 20);
        Scanner sc = new Scanner(System.in);
        b.displayInfo();

        Book b1 = new Book();
        System.out.print("Nhap ma sach: ");
        b1.setBookId(sc.nextLine());
        System.out.print("Nhap tieu de sach: ");
        b1.setTitle(sc.nextLine());
        System.out.print("Nhap ten tac gia: ");
        b1.setAuthor(sc.nextLine());
        System.out.print("Nhap nam xuat ban: ");
        b1.setPublicationYear(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap so luong sach: ");
        b1.setQuantity(Integer.parseInt(sc.nextLine()));
        b1.displayInfo();

        Textbook tb = new Textbook("s03", "Toan hoc", "So Giao Duc", 1878 , 20, "Van hoc", "Dai hoc");
        System.out.println(tb.toString());

        Novel n = new Novel("s04", "Khong Gia Dinh", "Hector Malot", 1878 , 20, "Van hoc", true);
        System.out.println(n.toString());

        list.addBook(b);
        list.addBook(b1);
        list.addBook(tb);
        list.addBook(n);
        list.addBook();
        list.displayList();

        list.updateBook();
        list.displayList();

        list.deleteBook();
        list.displayList();
        sc.close();
    }
}
