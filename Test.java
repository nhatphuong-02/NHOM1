public class Test {
    public static void main(String[] args) {
        QuanLySach qlySach=new QuanLySach();
        SachTieuThuyet stt1=new SachTieuThuyet("005", "Cristiano Ronaldo", "Ricabiado", 2012, 10, 100000, "Truyện ngắn", true);
        qlySach.themSach(stt1);
        System.out.println("\nDanh sách sau khi thêm sách:");
        qlySach.hienThiDanhSachSach();
        System.out.println("Kiểm tra số lượng tồn kho của mã sách "+stt1.getMaSach()+":"+(stt1.kiemTraTonKho(100)?" Đủ số lượng":" Không đủ số lượng"));
        stt1.capNhatViTri("Kho B1-Kệ 10");

        IKiemKe sachGT2=new SachGiaoTrinh("003", "Giải thuật java", "Anh ba khía", 2019, 100, 100000, "Java", "Đại học");
        System.out.println("\nKiểm tra số lượng tồn kho của mã sách 003: "+(sachGT2.kiemTraTonKho(100)?" Đủ số lượng":" Không đủ số lượng"));
        sachGT2.capNhatViTri("Kho A1-Kệ 5");
    }
    
}
