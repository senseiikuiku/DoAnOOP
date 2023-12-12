public class Chitietpn {
    private static int countId;
    protected String id;
    protected String idphieuxuat;
    protected String[] chitietsanpham;

    public Chitietpn(){
        countId++;
        this.id = "ctpn" + countId;
        this.id = "";
        this.idphieuxuat = "";
        this.chitietsanpham = null;
    }

    public Chitietpn(String idphieuxuat){
        countId++;
        this.id = "ctpn" + countId;
        this.idphieuxuat = idphieuxuat;
    }

    public Chitietpn(String id, String  idphietxuat, String[] chitietsanpham){
        this.id = id;
        this.idphieuxuat = idphietxuat;
        this.chitietsanpham = chitietsanpham;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdphieuxuat() {
        return this.idphieuxuat;
    }

    public void setIdphieuxuat(String idphieuxuat) {
        this.idphieuxuat = idphieuxuat;
    }

    public String[] getChitietsanpham() {
        return this.chitietsanpham;
    }

    public void setChitietsanpham(String[] chitietsanpham) {
        this.chitietsanpham = chitietsanpham;
    }

}
