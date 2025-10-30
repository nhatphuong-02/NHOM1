package task.TUAN5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach list = new BookManage();
        Scanner sc = new Scanner(System.in);

        Textbook tb1 = new Textbook("gt01", "Hinh hoc", "So Giao Duc", 2020 , 20, "Toan hoc", "Dai hoc",30000);
        System.out.println(tb1.toString());
        Textbook tb2 = new Textbook("gt02", "Dai so", "So Giao Duc", 2020 , 200, "Toan hoc", "Dai hoc",30000);
        System.out.println(tb1.toString());

        Novel nv = new Novel("tt01", "Khong Gia Dinh", "Hector Malot", 1878 , 20, "Van hoc", true,200000);
        System.out.println(nv.toString());

        list.addBook(tb1);
        list.addBook(tb2);
        list.addBook(nv);
        list.addBook();
        list.displayList();

        list.updateBook();
        list.displayList();

        list.deleteBook();
        list.displayList();
        sc.close();

        IKiemke kiemKe = tb1;
        System.out.println((kiemKe.kiemTraTonKho(100)?"Co du so luong sach "+tb1.title+" trong kho":"So luong sach "+tb1.title+" trong kho khong du"));
        kiemKe.capNhatViTri("Kho A1-Ke 5");

        System.out.println((tb2.kiemTraTonKho(100)?"Co du so luong sach "+tb2.title+" trong kho":"So luong sach "+tb2.title+" trong kho khong du"));
        tb2.capNhatViTri("Kho A1-Ke 5");

        
    }
}
