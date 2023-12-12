public class nhacungcap {
    private static int countId;
    private String id;
    private String tennhacungcap;
    private String diachi;

    public nhacungcap() {
        countId++;
        id = "ncc" + countId;
    }

    public nhacungcap(String id, String tennhacungcap, String diachi) {
        this.id = id;
        this.tennhacungcap = tennhacungcap;
        this.diachi = diachi;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTennhacungcap() {
        return this.tennhacungcap;
    }

    public void setTennhacungcap(String tennhacungcap) {
        this.tennhacungcap = tennhacungcap;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
