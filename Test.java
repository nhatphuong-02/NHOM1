public class Test {
   public static void main(String[] args) {
        QuanLySach qlSach=new QuanLySach();
/*         SachGiaoTrinh sachGT1=new SachGiaoTrinh("001", "Giải tích", "Nguyễn Văn A", 2021, 199, 25000, "Giải tích 1" ,"Đại học");
        System.out.println(sachGT1.toString());

        SachTieuThuyet sachTT1=new SachTieuThuyet("002", "Harry Pỏn", "Hub", 2015, 100, 100000, "Tiểu thuyết", true);
        System.out.println(sachTT1.toString()); 
        
        System.out.println("Danh sach khi chua them sach:");
        qlSach.hienThiDanhSachSach();

        qlSach.themSach(sachGT1);
        qlSach.themSach(sachTT1);
        System.out.println("Danh sach khi them sach:");
        qlSach.hienThiDanhSachSach();

        System.out.println("Danh sach sau khi xoa sach co ma 002:");
        qlSach.xoaSach("002");
        qlSach.hienThiDanhSachSach();

        System.out.println("Tim kiem sach co ma 001:");
        Sach maCanTim = new SachGiaoTrinh();
        maCanTim.setMaSach("001");
        Sach ketQua=qlSach.timKiemSach(maCanTim.getMaSach());
        if (ketQua != null) {
                System.out.println("Tim thay sach co ma sach "+maCanTim.getMaSach()+"\n" + ketQua);
            } else {
                System.out.println("Khong tim thay sach co ma: " + maCanTim);
            }
        
        
        System.out.println("Tim kiem sach co ma 002:");
        Sach maCanTim2 = new SachTieuThuyet();
        maCanTim2.setMaSach("002");
        Sach ketQua2=qlSach.timKiemSach(maCanTim2.getMaSach());
        if (ketQua2 != null) {
                System.out.println("Tim thay sach co ma sach "+maCanTim2.getMaSach()+"\n" + ketQua);
            } else {
                System.out.println("Khong tim thay sach co ma: " + maCanTim2.getMaSach());
            }

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();

        System.out.println("Cap nhat tieu de sach co ma 001 thanh 'Đại số tuyến tính':");
        qlSach.capNhatTieuDe("001", "Đại số tuyến tính");
        qlSach.hienThiDanhSachSach();  

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();

        System.out.println("Cap nhat tac gia sach co ma 001 thanh 'Lại Đổ Thừa':");
        qlSach.capNhatTacGIa("001", "Lại Đổ Thừa");
        qlSach.hienThiDanhSachSach();  

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();

        System.out.println("Cap nhat nam xuat ban sach co ma 001 thanh 2010:");
        qlSach.capNhatNamXuatBan("001", 2010);
        qlSach.hienThiDanhSachSach();  

        System.out.println("Danh sach truoc khi cap nhat:");
        qlSach.hienThiDanhSachSach();

        System.out.println("Cap nhat so luong sach co ma 001 thanh 1000:");
        qlSach.capNhatSoLuong("001", 1000);
        qlSach.hienThiDanhSachSach();

        System.out.println("Xóa sách có mã sách 001");
        qlSach.xoaSach("001");
        System.out.println("Danh sách sau khi xóa:");
        qlSach.hienThiDanhSachSach();
        System.out.println("\n\n");
 */
        SachTieuThuyet stt1=new SachTieuThuyet("005", "Cristiano Ronaldo", "Ricabiado", 2012, 10, 100000, "Truyện ngắn", true);
        qlSach.themSach(stt1);
        System.out.println("\nDanh sách sau khi thêm sách:");
        qlSach.hienThiDanhSachSach();
        System.out.println("Kiểm tra số lượng tồn kho của mã sách "+stt1.getMaSach()+":"+(stt1.kiemTraTonKho(100)?" Đủ số lượng":" Không đủ số lượng"));
        stt1.capNhatViTri("Kho B1-Kệ 10");

        IkiemKe sachGT2=new SachGiaoTrinh("003", "Giải thuật java", "Anh ba khía", 2019, 100, 100000, "Java", "Đại học");
        System.out.println("\nKiểm tra số lượng tồn kho của mã sách 003: "+(sachGT2.kiemTraTonKho(100)?" Đủ số lượng":" Không đủ số lượng"));
        sachGT2.capNhatViTri("Kho A1-Kệ 5");
    }
}
