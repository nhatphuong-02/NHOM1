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
    
    //Nhap
    public void Input(){
        super.Input();
        System.out.print("Nhap mon hoc: ");
        this.subject = sc.nextLine();

        System.out.print("Nhap cap do: ");
        this.level = sc.nextLine();
    }
    //Xuat
    @Override
    public String toString() {
        return super.toString() +"\nMon hoc       : "+this.subject+"\nCap do        : "+this.level+"\nGia ban       : "+this.cost()+"\n";
    }

    //Tính giá bán
    @Override
    public double cost() {
        return this.giaCoBan+(2025-this.publicationYear)*5000;
    }

    //Hàm hiển thị dưới dạng bảng
    @Override
    public void displayTable(){
        System.out.printf("%-10s %-25s %-20s %-10d %-10d %-20.2f\n",
                        this.bookId, this.title, this.author, this.publicationYear, this.quantity, this.cost());
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
        return this.cost();
    }
}