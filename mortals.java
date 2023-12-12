import java.util.Date;

public abstract class mortals {
    protected long cccd;
    protected String name;
    protected Date birthday;
    // protected String address;
    protected String phonenumber;
    protected char gender;

    public mortals() {
        birthday = new Date();
        this.birthday.setYear(this.birthday.getYear() + 1900);
    }

    public mortals(long cccd, String name, String phonenumber, char gender, int ngay,
            int thang,
            int nam) {
        this.cccd = cccd;
        this.name = name;
        // this.address = address;
        this.phonenumber = phonenumber;
        this.gender = gender;
        birthday = new Date(nam, (thang - 1), ngay);
    }

    public long getCccd() {
        return this.cccd;
    }

    public void setCccd(long cccd) {
        this.cccd = cccd;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public String getBirthdayNEW() {
        return this.birthday.getDate() + "/" + (this.birthday.getMonth() + 1) + "/"
                + this.birthday.getYear();
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(int nam, int thang, int ngay) {
        birthday.setDate(ngay);
        birthday.setMonth((thang - 1));
        birthday.setYear(nam);
        System.out.println(birthday);
    }

    // public String getAddress() {
    // return this.address;
    // }

    // public void setAddress(String address) {
    // this.address = address;
    // }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        Date currYear = new Date();
        return ((currYear.getYear() + 1900) - this.birthday.getYear());
    }

    // public static void main(String[] args) {
    // account a = new account();
    // human ditmemay = new human(123, "duc ngu", "tphcm", 9090, 'm', a, 1, 1,
    // 2010);
    // System.out.println(ditmemay.getAge());
    // }
}