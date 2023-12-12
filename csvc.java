public class csvc {
    private int countId;
    private String id;
    private String tencsvc;
    private String tinhtrang;

    public csvc() {
        countId++;
        id = "csvc" + countId;
    }

    public csvc(String id, String tencsvc, String tinhtrang) {
        this.id = id;
        this.tencsvc = tencsvc;
        this.tinhtrang = tinhtrang;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTencsvc() {
        return this.tencsvc;
    }

    public void setTencsvc(String tencsvc) {
        this.tencsvc = tencsvc;
    }

    public String getTinhtrang() {
        return this.tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

}
