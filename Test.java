public class Test {
    public static void main(String[] args) {
        // ===== Tạo đối tượng sách bằng constructor có tham số =====
        Sach sach1 = new Sach("S001", "Lập trình Java cơ bản", "Nguyễn Văn A", 2023, 10);
        Sach sach2 = new Sach("S002", "Cấu trúc dữ liệu và giải thuật", "Trần Thị B", 2022, 5);
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        Sach sach3 = new Sach();
        sach3.setMaSach("001");
        sach3.setTieuDe("Cô nan");
        sach3.setTacGia("Phạm Thanh Tiến");
        sach3.setNamXuatBan(2006);
        sach3.setSoLuong(1);
        sach3.hienThiThongTin();
    }
}
