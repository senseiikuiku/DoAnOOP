import java.util.Date;

public abstract class nhanvien extends mortals {
    private static int countId;
    protected String id;
    protected int luongcb;
    protected double hesoluong;
    protected String chucvu;
    protected Date startedDate;
    protected String account;

    public nhanvien() {
        countId++;
        startedDate = new Date();
        this.startedDate.setYear(this.startedDate.getYear() + 1900);
    }

    // public nhanvien(String id, int luongcb, double hesoluong, String chucvu, int
    // ngay, int thang, int nam,
    // String account) {
    // this.id = id;
    // this.luongcb = 9000000;
    // this.hesoluong = 1.0;
    // this.chucvu = chucvu;
    // startedDate = new Date(ngay, thang, nam);
    // this.account = account;
    // }

    // public nhanvien(int luongcb, double hesoluong, String chucvu, int ngay, int
    // thang, int nam, String accid) {
    // countId++;
    // id = "nv" + countId;
    // this.hesoluong = hesoluong;
    // this.chucvu = chucvu;
    // startedDate = new Date(ngay, thang, nam);
    // account = accid;
    // }

    public nhanvien(long cccd, String name, String phonenumber, char gender, int ngay, int thang,
            int nam) {
        super(cccd, name, phonenumber, gender, ngay, thang, nam);
        countId++;
        id = "nv" + countId;
        startedDate = new Date(nam, thang - 1, ngay);
    }

    public nhanvien(String id, long cccd, String name, String phonenumber, char gender, int ngaysinh,
            int thangsinh, int namsinh, int luongcb, double hesoluong, String chucvu, String accid) {
        super(cccd, name, phonenumber, gender, ngaysinh, thangsinh, namsinh);
        // countId++;
        this.id = id;
        this.luongcb = 9000000;
        this.hesoluong = hesoluong;
        this.chucvu = chucvu;
        birthday = new Date(namsinh, thangsinh - 1, ngaysinh);
        account = accid;
    }

    public nhanvien(long cccd, String name, String phonenumber, char gender, int ngaysinh,
            int thangsinh, int namsinh, int luongcb, double hesoluong, String chucvu, String accid) {
        super(cccd, name, phonenumber, gender, ngaysinh, thangsinh, namsinh);
        countId++;
        id = "nv" + countId;
        this.luongcb = 9000000;
        this.hesoluong = hesoluong;
        this.chucvu = chucvu;
        birthday = new Date(namsinh, thangsinh - 1, ngaysinh);
        account = accid;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLuongcb() {
        return this.luongcb;
    }

    public void setLuongcb(int luongcb) {
        this.luongcb = luongcb;
    }

    public double getHesoluong() {
        return this.hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public String getChucvu() {
        return this.chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public Date getStartedDate() {
        return this.startedDate;
    }

    public String getNewBirthday() {
        return this.birthday.getDate() + "/" + (this.birthday.getMonth() + 1) + "/"
                + this.birthday.getYear();
    }

    public String getNewStartedDate() {
        Date newStartedDate = new Date();
        int year = newStartedDate.getYear();
        newStartedDate.setYear((year + 1900));
        return newStartedDate.getDate() + "/" + (newStartedDate.getMonth() + 1) + "/" + newStartedDate.getYear();
    }

    public abstract int tinhluong();

    public abstract void shownhanvien();

    @Override
    public String toString() {
        return String.format("%-5s| %-15s| %-10s| %-11s| %-10s| %-15s| %-15s| %-10s| %-20s\n", id,
                name,
                getNewBirthday(), phonenumber, gender, luongcb, hesoluong, chucvu,
                getNewStartedDate());
    }
}