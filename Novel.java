public class Novel extends Book {
    private String genre;
    private boolean isSeries;

    public Novel(){}

    public Novel(String bookId, String title, String author, int publicationYear, int quantity,String genre, boolean isSeries, double giaCoBan ){
        super(bookId, title, author, publicationYear, quantity,giaCoBan);
        this.genre=genre;
        this.isSeries=isSeries;
    }

    public boolean getSeries(){
        return isSeries;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setSeries(boolean isSeries) {
        this.isSeries = isSeries;
    }

    @Override
    public String toString() {
        return super.toString() +"\nThe loai      : "+genre+"\n"+(isSeries?"Thuoc the loai series":"Khong thuoc the loai series")+"\nGia ban       : "+cost()+"\n";
    }

    @Override
    public double cost(){
        return (isSeries? giaCoBan+15000: giaCoBan);
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
