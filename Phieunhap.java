import java.util.Date;

public class Phieunhap {
    private static int countId;
    private String id;
    private String idnhacungcap;
    private String chitietphieunhap;
    private Date ngaynhaphang;

    public Phieunhap() {
        countId++;
        this.id = "px" + countId;
        this.idnhacungcap = "";
        this.chitietphieunhap = "";
        this.ngaynhaphang = new Date();
        ngaynhaphang.setYear(ngaynhaphang.getYear() + 1900);
    }

    public Phieunhap(String idnhacungcap, String chitietphieunhap, int ngay, int thang, int nam) {
        countId++;
        this.id = "px" + countId;
        this.idnhacungcap = idnhacungcap;
        this.chitietphieunhap = chitietphieunhap;
        ngaynhaphang = new Date(nam, thang, ngay);
    }

    public Phieunhap(String id, String idnhacungcap, String chitietphieunhap, int ngay, int thang, int nam) {
        this.id = id;
        this.idnhacungcap = idnhacungcap;
        this.chitietphieunhap = chitietphieunhap;
        ngaynhaphang = new Date(nam, thang, ngay);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdnhacungcap() {
        return this.idnhacungcap;
    }

    public void setIdnhacungcap(String idnhacungcap) {
        this.idnhacungcap = idnhacungcap;
    }

    public String getChitietphieunhap() {
        return this.chitietphieunhap;
    }

    public void setChitietphieunhap(String chitietphieunhap) {
        this.chitietphieunhap = chitietphieunhap;
    }

    public Date getNgaynhaphang() {
        return this.ngaynhaphang;
    }

    public void setNgaynhaphang(Date ngaynhaphang) {
        this.ngaynhaphang = ngaynhaphang;
    }

}