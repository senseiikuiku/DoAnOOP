public abstract class Sanpham {
    protected String id;
    protected String ten;
    protected String loai;
    protected int gia;
    protected int soLuong;
    protected String nhacungcapId;

    public Sanpham() {
    }

    public Sanpham(String ten, String loai, int gia, int soLuong, String nhacungcapId) {
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nhacungcapId = nhacungcapId;
    }

    public String getId() {
        return this.id;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return this.loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getGia() {
        return this.gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhacungcap() {
        return this.nhacungcapId;
    }

    public void setNhacungcap(String nhacungcapId) {
        this.nhacungcapId = nhacungcapId;
    }

    public String toString() {
        return String.format("%-10s| %-30s| %-10s| %-10d| %-15d| %-15s\n", id, ten, loai, gia, soLuong,
                nhacungcapId);
    }
}