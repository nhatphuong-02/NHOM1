public class Book{
    private String bookId;
    private String title;
    private String author;
    private int publicationYear;
    private int quantity;

    //Constructor
    public Book(String bookId, String title, String author, int publicationYear, int quantity){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
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

    //Getter
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
    public void displayInfo(){
        System.out.println("/nMa sach: "+bookId );
        System.out.println("Tieu de: "+title);
        System.out.println("Tac gia: "+author);
        System.out.println("Nam xuat ban: "+publicationYear);
        System.out.println("So luong: "+quantity);
    }
}