public class SachTieuThuyet extends Sach{
    private String theLoai;
    private Boolean laSachseries;
    public SachTieuThuyet(){
        super();
     }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachseries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong); 
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
    public String toString(){
        return super.toString()
        +"\nthể loại  "+theLoai
        +"\nla seri   "+laSachseries;
    }
}