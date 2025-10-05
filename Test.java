package TUAN5;

public class Test {
   public static void main(String[] args) {
        Sach sach1=new Sach("001", "VatLy", "BGD" ,2024, 110);
        Sach sach2=new Sach("002", "HoaHoc", "BGD", 2024, 150);

        sach1.hienthithongtin();
        sach2.hienthithongtin();

        Sach sach3=new Sach();
        sach3.setmaSach("003");
        sach3.settieuDe("Toan");
        sach3.settacgia("BGD");
        sach3.setNXB(2024);
        sach3.setsoLuong(100);

        sach3.hienthithongtin();
   }
}