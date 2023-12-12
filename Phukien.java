public class Phukien extends Sanpham {
    static private int countId;

    public Phukien() {
        super();
        countId++;
        id = "pk" + countId;
    }

    public Phukien(String ten, int gia, int soLuong, String nhacungcap) {
        super(ten, "phukien", gia, soLuong, nhacungcap);
        countId++;
        id = "pk" + countId;
    }

    public Phukien(String id, String ten, int gia, int soLuong, String nhacungcap) {
        super(ten, "phukien", gia, soLuong, nhacungcap);
        this.id = id;
    }

    public static void setcountId(int newId) {
        countId = newId;
    }

    public static int getcountId() {
        return countId;
    }

    // @Override
    // public String toString() {
    // return String.format("%-10s| %-30s| %-10s| %-10d| %-15d| %-30s| %-10s\n", id,
    // ten, loai, gia, soLuong,
    // nhacungcapId, "*");
    // }

}
