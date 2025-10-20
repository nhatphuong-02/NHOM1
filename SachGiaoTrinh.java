public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(){
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);       
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan, String monHoc, String capDo){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Mon hoc: "+monHoc);
        System.out.println("Cap Do: "+capDo);
        System.out.println("___________________________________________");
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
    @Override
    public double getGiaCoBan() {
        return super.getGiaCoBan();
    }
    public String getMonHoc(){
        return monHoc;
    }
    public String getCapDo(){
        return capDo;
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
    public void setGiaCoBan(double giaCoBan) {
        super.setGiaCoBan(giaCoBan);
    }
    public void setMonHoc(String monHoc){
        this.monHoc = monHoc;
    }
    public void setCapDo(String capDo){
        this.capDo = capDo;
    }
    @Override
    public String toString(){
        return super.toString()+
        "\nMon hoc: "+monHoc+
        "\nCap do: "+capDo+
        "\nGia ban: "+giaBan()+
        "\n______________________________________________";
    }
    @Override
    public double giaBan(){
        return(giaCoBan+(2025 - namXuatBan())*5000 );
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu){
        return soLuong>=soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách "+getTieuDe()+" đến khu vực: "+viTriMoi);
    }
    

}
