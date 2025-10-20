import java.util.ArrayList;
import java.util.Scanner;

public class BookManage {
    protected ArrayList<Book> ar = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //Thêm mới
    public void addBook(Book b){
        ar.add(b);
    }
    public void addBook(){
        Book b = new Book();

        System.out.print("Nhap ma sach: ");
        b.bookId = sc.nextLine().trim();
        for(Book a : ar)
            if(a.bookId.equalsIgnoreCase(b.bookId)){
                System.out.println("Ma sach da ton tai!");
                return;
            }

        System.out.print("Nhap tieu de: ");
        b.title = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        b.author = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        b.publicationYear = Integer.parseInt(sc.nextLine());
        
        System.out.print("Nhap so luong: ");
        b.quantity = Integer.parseInt(sc.nextLine());
        ar.add(b);

        System.out.println("Them sach thanh cong!");
    }

    //Xóa
    public void deleteBook(Book b){
        ar.remove(b);
    }
    public void deleteBook(){
        System.out.print("Nhap ma sach muon xoa: ");
        String deleteId = sc.nextLine().trim();

        boolean removed = ar.removeIf(a->a.bookId.equalsIgnoreCase(deleteId));
        if(removed)
            System.out.println("Da xoa sach co ma: "+deleteId);
        else
            System.out.println("Khong tim thay sach co ma: "+deleteId);
    }

    //Cập nhật
    public void updateBook(){
        System.out.print("Nhap ma sach can cap nhat: ");
        String updateId = sc.nextLine().trim();

        for (Book a : ar)
            if (a.bookId.equalsIgnoreCase(updateId)) {
                System.out.println("Nhap thong tin moi cho sach:");
                System.out.print("Tieu de: ");
                a.title = sc.nextLine();

                System.out.print("Tac gia: ");
                a.author = sc.nextLine();

                System.out.print("Nam xuat ban: ");
                a.publicationYear = Integer.parseInt(sc.nextLine());
                System.out.print("So luong: ");

                a.quantity = Integer.parseInt(sc.nextLine());
                System.out.println("Cap nhat thanh cong!");

                return;
            }

        System.out.println("Khong tim thay sach co ma: " + updateId);
}

        //Tìm kiếm theo mã sách
        public void searchBook(){
            System.out.print("Nhap ma sach can tim: ");
            String updateId = sc.nextLine().trim();

            for(Book a : ar)
                if(a.bookId.equalsIgnoreCase(updateId)){
                    System.out.println("Thong tin sach can tim");
                    a.displayInfo();
                    return;
                }

            System.out.println("Khong tim thay ket qua phu hop!");
        }

        //Hiển thị danh sách sách
        public void displayList(){
            if(ar.isEmpty()){
                System.out.println("Danh sach trong!");
                return;
            }

            System.out.println("===================================DANH SACH==================================");
            System.out.printf("%-10s %-25s %-20s %-10s %-10s\n", 
                             "MaSach", "TieuDe", "TacGia", "NamXB", "SoLuong");
            System.out.println("--------------------------------------------------------------------------");
            for(Book a: ar)
                a.displayTable();
        }
}