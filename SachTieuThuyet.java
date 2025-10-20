public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(){
        super();
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("The loai: "+theLoai);
        System.out.println("Nha xuat ban: "+(laSachSeries ? "Co" : "Khong"));
        System.out.println("__________________________________________________");
    }
    public String getMaSach(){
        return super.getMaSach();
    }
    public String getTieuDe(){
        return super.getTieuDe();
    }
    public String getTacGia(){
        return super.getTacGia();
    }
    public int namXuatBan(){
        return super.getNamXuatBan();
    }
    public int getSoLuong(){
        return super.getSoLuong();
    }
    public double getGiaCoBan() {
        return super.getGiaCoBan();
    }
    public String getTheLoai(){
        return theLoai;
    }
    public boolean isLaSachSeries(){
        return laSachSeries;
    }
    public void setMaSach(String maSach){
        super.setMaSach(maSach);
    }
    public void setTieuDe(String tieuDe){
        super.setTieuDe(tieuDe);
    }
    public void setTacGia(String tacGia){
        super.setTacGia(tacGia);
    }
    public void setNamXuatBan(int namXuatBan){
        super.setNamXuatBan(namXuatBan);
    }
    public void setSoLuong(int soLuong){
        super.setSoLuong(soLuong);
    }
    @Override
    public void setGiaCoBan(double giaCoBan) {
        super.setGiaCoBan(giaCoBan);
    }
    public void setMonHoc(String monHoc){
        this.theLoai = theLoai;
    }
    public void setCapDo(boolean laSachSeries){
        this.laSachSeries = laSachSeries;
    }
    @Override
    public String toString(){
        return super.toString()+
        "\nMon hoc: "+theLoai+
        "\nLa sach series: "+(laSachSeries ? "Co" : "Khong")+
        "\nGia ban: "+giaBan()+
        "\n______________________________________________";
    }
    @Override
    public double giaBan(){
        return (laSachSeries ? (giaCoBan+ 15000) : (giaCoBan));
    }
        @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return getSoLuong()>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách "+getTieuDe()+" đến khu vực: "+viTriMoi);
    }
    
}
