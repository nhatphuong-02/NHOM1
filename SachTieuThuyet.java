public class SachTieuThuyet extends Sach implements IkiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(){
        super();
    } 

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai=theLoai;
        this.laSachSeries=laSachSeries;
    }

    @Override
    public String getMaSach() {
        return super.getMaSach();
    }

    @Override
    public int getNamXuatBan() {
        return super.getNamXuatBan();
    }

    @Override
    public int getSoLuong() {
        return super.getSoLuong();
    }

    @Override
    public String getTacGia() {
        return super.getTacGia();
    }

    @Override
    public String getTieuDe() {
        return super.getTieuDe();
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }
    
    @Override
    public double getGiaCoBan() {
        return super.getGiaCoBan();
    }

    @Override
    public void setMaSach(String maSach) {
        super.setMaSach(maSach);
    }

    @Override
    public void setNamXuatBan(int namXuatBan) {
        super.setNamXuatBan(namXuatBan);
    }
    
    @Override
    public void setSoLuong(int soLuong) {
        super.setSoLuong(soLuong);
    }

    @Override
    public void setTacGia(String tacGia) {
        super.setTacGia(tacGia);
    }

    @Override
    public void setTieuDe(String tieuDe) {
        super.setTieuDe(tieuDe);
    }

    @Override
    public void setGiaCoBan(double giaCoBan) {
        super.setGiaCoBan(giaCoBan);
    }
    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nThe loai: "+theLoai
        + "\nLa sach series: "+(laSachSeries ? "Series" : "Khong phai Series");
    }

    @Override
    public double tinhGiaBan() {
       return laSachSeries?giaCoBan*1.5:0;
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return getSoLuong()>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách "+getTieuDe()+" đến khu vực: "+viTriMoi);
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("The loai: "+theLoai);
        System.out.println("Nha xuat ban: "+(laSachSeries ? "Co" : "Khong"));
        System.out.println("---------------------");
    }
}
