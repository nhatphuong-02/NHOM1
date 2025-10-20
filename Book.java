public abstract class Book implements Kiemke{
    protected String bookId;
    protected String title;
    protected String author;
    protected int publicationYear;
    protected int quantity;
    protected double giaCoBan;

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
    //Getter
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

    //Setter
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

    //Hàm hiển thị thông tin
    public void displayInfo() {
        System.out.println("--------- THONG TIN CHI TIET---------");
        System.out.println("Ma sach       : " + bookId);
        System.out.println("Tieu de        : " + title);
        System.out.println("Tac gia       : " + author);
        System.out.println("Nam xuat ban  : " + publicationYear);
        System.out.println("So luong      : " + quantity);
        System.out.println("--------------------------------------");
    }


    public abstract void displayTable();


    @Override
    public String toString() {
        return  "--------- THONG TIN CHI TIET---------\nMa sach       : "+bookId+
                "\nTieu de       : "+title+
                "\nTac gia       : "+author+
                "\nNam xuat ban  :  "+publicationYear+
                "\nSo luong      : "+quantity;
    }

    public abstract double cost();
}