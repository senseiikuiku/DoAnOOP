public class Dienthoai extends Sanpham {
    static private int countId;

    public Dienthoai() {
        super();
        countId++;
        id = "dt" + countId;
    }

    public Dienthoai(String ten, int gia, int soLuong, String nhacungcap) {
        super(ten, "dienthoai", gia, soLuong, nhacungcap);
        countId++;
        id = "dt" + countId;
    }

    public Dienthoai(String id, String ten, int gia, int soLuong, String nhacungcap) {
        super(ten, "dienthoai", gia, soLuong, nhacungcap);
        this.id = id;
    }

    public static void setcountId(int newId) {
        countId = newId;
    }

    public static int getcountId() {
        return countId;
    }

    @Override
    public String toString() {
        return String.format("%-10s| %-30s| %-10s| %-10d| %-15d| %-15s\n", id, ten, loai, gia, soLuong,
                nhacungcapId);
    }

}
