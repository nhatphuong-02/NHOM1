public abstract class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    public Sach() {
        
    }
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan){
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach(){
        return maSach;
    }
    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    public String getTieuDe(){
        return tieuDe;
    }
    public void setTieuDe(String tieuDe){
        this.tieuDe = tieuDe;
    }
    public String getTacGia(){
        return tacGia;
    }
    public void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }
    public int getNamXuatBan(){
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan){
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    public double getGiaCoBan() {
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    @Override
    public String toString(){
        return "Ma sach: "+maSach+
        "\nTieu de: "+tieuDe+
        "\nTac gia: "+tacGia+
        "\nNam xuat ban: "+namXuatBan+
        "\nSo luong: "+soLuong+
        "\nGia co ban: "+giaCoBan;
    }
    public void hienThiThongTin(){
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
        System.out.println("Gia co ban: "+giaCoBan);
        System.out.println("_________________________________________");
    }
    public void hienThiBang(){
        System.out.printf("%-10s %-25s %-20s %-10d %-10d\n",
                            maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }
    public abstract double giaBan();

    
}
