package task.TUAN5;

public class Novel extends Book {
    private String genre;
    private boolean isSeries;

    //Constructor
    public Novel(){}
    public Novel(String bookId, String title, String author, int publicationYear, int quantity,String genre, boolean isSeries, double giaCoBan ){
        super(bookId, title, author, publicationYear, quantity,giaCoBan);
        this.genre=genre;
        this.isSeries=isSeries;
    }

    //Get
    public boolean getSeries(){
        return isSeries;
    }
    public String getGenre() {
        return genre;
    }

    //Set
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setSeries(boolean isSeries) {
        this.isSeries = isSeries;
    }

    //Hàm nhập
    public void Input(){
        super.Input();
        System.out.print("Nhap the loai: ");
        this.genre = sc.nextLine();

        System.out.print("Co phai thuoc the loai dai ky khong(true/false): ");
        this.isSeries = Boolean.getBoolean(sc.nextLine());
    }

    //Hàm xuất
    @Override
    public String toString() {
        return super.toString() +"\nThe loai      : "+this.genre+"\n"+(this.isSeries?"Thuoc the loai series":"Khong thuoc the loai series")+"\nGia ban       : "+cost()+"\n";
    }

    //Hàm tính giá bán
    @Override
    public double cost(){
        return (this.isSeries? this.giaCoBan+15000: this.giaCoBan);
    }

    //Hàm xuất dạng bảng
    @Override
    public void displayTable(){
        System.out.printf("%-10s %-25s %-20s %-10d %-10d %-20.2f\n",
                        this.bookId, this.title, this.author, this.publicationYear, this.quantity, this.cost());
    }

    //Kiểm tra số lượng tồn kho
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return this.quantity>=soLuongToiThieu;
    }

    //Cập nhật vị trí
    @Override
    public void capNhatViTri(String viTriMoi){
        System.out.println("Da chuyen sach "+this.title+" den khu vuc: "+viTriMoi+"\n");
    }

    //Hàm tính giá bán
    @Override
    public double tinhGiaBan(){
        return this.cost();
    }
}
