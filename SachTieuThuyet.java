public class SachTieuThuyet extends Sach implements IkiemKe{
    private String theLoai;
    private Boolean laSachseries;
    public SachTieuThuyet(){
        super();
     }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachseries,double giacoban){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong,giacoban); 
        this.theLoai=theLoai;
        this.laSachseries=laSachseries;
    }
    public String gettheLoai(){
        return theLoai;
    }
    public void settheLoai(String theLoai){
        this.theLoai=theLoai;
    }
    public Boolean getlaSachseries(){
        return laSachseries;
    }
    public void setlaSachseries(Boolean laSachseries){
        this.laSachseries=laSachseries;
    }
    @Override
    public double tinhgiaban() {
        if (laSachseries)
        return giacoban+15000;
        else 
            return giacoban;
    }
    public String toString(){
        return super.toString()
        +"\nthe loai  "+theLoai
        +"\nla seri   "+laSachseries
        +"\ngia co ban "+tinhgiaban();
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return soLuong>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đa chuyen den  "+getTieuDe()+" den khu vuc: "+viTriMoi);
    } 
}