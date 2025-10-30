package task.TUAN5;

import java.util.Scanner;

public abstract class Book implements IKiemke, IGiaBan{
    protected String bookId;
    protected String title;
    protected String author;
    protected int publicationYear;
    protected int quantity;
    protected double giaCoBan;
    protected Scanner sc = new Scanner(System.in);

    //Constructor
    public Book(String bookId, String title, String author, int publicationYear, int quantity, double giaCoBan){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
        this.giaCoBan = giaCoBan;
    }
    public Book(String bookId, String title){
        this.bookId = bookId;
        this.title = title;
    }
    public Book(String title, String author, int quantity){
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }
    public Book() {
    }

    //Get
    public double getGiaCoBan() {
        return giaCoBan;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookId() {
        return bookId;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getTitle() {
        return title;
    }

    //Set
    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //Hàm nhập
    public void Input(){
        System.out.print("Nhap ma sach: ");
        this.bookId = sc.nextLine();

        System.out.print("Nhap tieu de: ");
        this.title = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        this.author = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        this.publicationYear = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so luong: ");
        this.quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap gia co ban: ");
        this.giaCoBan = Integer.parseInt(sc.nextLine());
    }

    //Hàm hiển thị thông tin
    public void displayInfo() {
        System.out.println("--------- THONG TIN CHI TIET---------");
        System.out.println("Ma sach       : " + this.bookId);
        System.out.println("Tieu de        : " + this.title);
        System.out.println("Tac gia       : " + this.author);
        System.out.println("Nam xuat ban  : " + this.publicationYear);
        System.out.println("So luong      : " + this.quantity);
        System.out.println("--------------------------------------");
    }

    //Các hàm trừ tượng
    public abstract void displayTable();
    public abstract double cost();

    //Hàm xuất
    @Override
    public String toString() {
        return  "--------- THONG TIN CHI TIET---------\nMa sach       : "+this.bookId+
                "\nTieu de       : "+this.title+
                "\nTac gia       : "+this.author+
                "\nNam xuat ban  :  "+this.publicationYear+
                "\nSo luong      : "+this.quantity;
    }

}