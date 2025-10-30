package task.TUAN5;

public class Textbook extends Book {
    private String subject;
    private String level;

    //Constructor
    public Textbook(){} 
    public Textbook(String bookId, String title, String author, int publicationYear, int quantity, String subject,String level,double giaCoBan){
        super(bookId, title, author, publicationYear, quantity, giaCoBan);
        this.subject=subject;
        this.level=level;
    }
    
    //Set
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    //Get
    public String getSubject() {
        return subject;
    }
    public String getLevel() {
        return level;
    }
    
    //Xuat
    @Override
    public String toString() {
        return super.toString() +"\nMon hoc       : "+subject+"\nCap do        : "+level+"\nGia ban       : "+cost()+"\n";
    }

    //Tính giá bán
    @Override
    public double cost() {
        return giaCoBan+(2025-publicationYear)*5000;
    }

    //Hàm hiển thị dưới dạng bảng
    @Override
    public void displayTable(){
        System.out.printf("%-10s %-25s %-20s %-10d %-10d %-20.2f\n",
                        bookId, title, author, publicationYear, quantity,cost());
    }

    //Kiểm tra tồn kho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return this.quantity>=soLuongToiThieu;
    }

    //Cập nhật vị trí
    @Override
    public void capNhatViTri(String viTriMoi){
        System.out.println("Da chuyen sach "+this.title+" den khu vuc: "+viTriMoi+"\n");
    }

    //Tính giá bán
    @Override
    public double tinhGiaBan(){
        return cost();
    }
}