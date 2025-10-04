package Tuan5;

public class Test {
   public static void main(String[] args) {
        Sach sach1=new Sach("001", "HoaHoc", "BGD" ,2024, 100);
        Sach sach2=new Sach("002", "SinhHoc", "BGD", 2024, 150);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        Sach sach3=new Sach();
        sach3.setMaSach("003");
        sach3.setTieuDe("Toan");
        sach3.setTacGia("BGD");
        sach3.setNamXuatBan(2024);
        sach3.setSoLuong(99);

        sach3.hienThiThongTin();
   }
}
