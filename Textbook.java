public class Textbook extends Book {
    private String subject;
    private String level;

    public Textbook(){}
    
    public Textbook(String bookId, String title, String author, int publicationYear, int quantity, String subject,String level,double giaCoBan){
        super(bookId, title, author, publicationYear, quantity, giaCoBan);
        this.subject=subject;
        this.level=level;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getSubject() {
        return subject;
    }
    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() +"\nMon hoc       : "+subject+"\nCap do        : "+level+"\nGia ban       : "+cost()+"\n";
    }

    @Override
    public double cost() {
        return giaCoBan+(2025-publicationYear)*5000;
    }

    @Override
    public void displayTable(){
        System.out.printf("%-10s %-25s %-20s %-10d %-10d %-20.2f\n",
                        bookId, title, author, publicationYear, quantity,cost());
    }
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return this.quantity>=soLuongToiThieu;
    }
    public void capNhatViTri(String viTriMoi){
        System.out.println("Da chuyen sach "+this.title+" den khu vuc: "+viTriMoi+"\n");
    }
}