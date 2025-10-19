public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(){
        super();
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);       
    }
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
        "\n______________________________________________";
    }

    
}
