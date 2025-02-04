import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class dskhachhang {
    private khachhang[] dskh;
    private int soluong;

    public dskhachhang() {
        dskh = new khachhang[0];
    }

    public void setKH(khachhang kh[]) {
        this.dskh = kh;
    }

    public void XuatKH() {
        System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                "Ngay sinh", "SDT", "Gioi tinh");
        for (khachhang i : dskh) {
            System.out.print(i);
        }
    }

    public void writeToFile() {
        try {
            FileWriter file = new FileWriter("Khachhang.txt");
            file.write(
                    String.format("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                            "Ngay sinh", "SDT", "Gioi tinh"));
            for (khachhang i : dskh) {
                file.write(i.toString());
            }
            file.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void themKH(khachhang kh) {
        dskh = Arrays.copyOf(dskh, soluong + 1);
        dskh[soluong++] = kh;
    }

    public void themKHmoi(Scanner sc) {
        System.out.println();
        System.out.print("Nhap cccd khach hang moi: ");
        long cccd = checkPattern.checkcccd(sc);

        System.out.print("Nhap ten khach hang moi: ");
        String name = sc.nextLine();

        System.out.println("Nhap ngay sinh khach hang moi.");
        System.out.print("Nhap ngay sinh: ");
        int newday = checkPattern.checkNgayThang(sc);
        System.out.print("Nhap thang sinh: ");
        int newmonth = checkPattern.checkNgayThang(sc);
        System.out.print("Nhap nam sinh: ");
        int newyear = checkPattern.checkNam(sc);

        System.out.print("Nhap so dien thoai khach hang moi: ");
        String phone = checkPattern.checkSdt(sc);

        System.out.print("Nhap gioi tinh khach hang moi M/F: ");
        char gender = checkPattern.checkgt(sc);

        khachhang newKH = new khachhang(cccd, name, newday, newmonth, newyear, name, phone, gender);
        themKH(newKH);
        System.out.println("Da them thanh cong.");

    }

    public int SearchKHId(String id) {
        int index = -1;
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    public void xoaKH(Scanner sc) {
        if (dskh.length <= 0) {
            System.out.println("danh sach khong con khach hang");
            return;
        }
        System.out.println();
        System.out.print("Nhap id khach hang can xoa: ");
        String id = checkPattern.checkID(sc, dskh[0]);

        int index = SearchKHId(id);
        if (index == -1) {
            System.out.println("Khong tim thay id khach hang.");
            return;
        } else {
            for (; index < dskh.length; index++) {
                if (dskh[index].getId().equals(id)) {
                    for (int j = index; j < dskh.length - 1; j++) {
                        dskh[j] = dskh[j + 1];
                    }
                }
            }
            dskh = Arrays.copyOf(dskh, soluong - 1);
            soluong--;
            System.out.println();
            System.out.println("Da xoa thanh cong.");
        }
    }

    public int timKHtheoId(String id) {
        for (int i = 0; i < dskh.length; i++) {
            if (dskh[i].getId().equals(id))
                return i;
        }
        return -1;
    }

    public void suaKH(Scanner sc) {
        if (dskh.length <= 0) {
            System.out.println("khong co khach hang de sua");
            return;
        }
        System.out.println();
        XuatKH();
        System.out.println();
        System.out.print("Nhap id khach hang can sua: ");
        String id = checkPattern.checkID(sc, dskh[0]);

        int index = timKHtheoId(id);
        if (index == -1) {
            System.out.println("Khong tim thay id khach hang can sua.");
            return;
        }
        System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                "Ngay sinh", "SDT", "Gioi tinh");
        System.out.println(dskh[index]);

        String option;
        do {
            System.out.println("========== Sua thong tin Khach Hang ==========");
            System.out.println("1. cccd");
            System.out.println("2. ten");
            System.out.println("3. ngay sinh");
            // System.out.println("4. dia chi");
            System.out.println("4. sdt");
            System.out.println("5. gioi tinh");
            System.out.println("Nhap x de tro lai");
            System.out.print("Chon thong tin ban muon sua: ");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    System.out.println();
                    System.out.print("Nhap lai cccd khach hang: ");
                    long newCccd = checkPattern.checkcccd(sc);
                    dskh[index].setCccd(newCccd);
                    System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                            "Ngay sinh", "SDT", "Gioi tinh");
                    System.out.println(dskh[index]);
                    break;
                case "2":
                    System.out.println();
                    System.out.print("Nhap lai ten khach hang: ");
                    String newName = sc.nextLine();
                    dskh[index].setName(newName);
                    System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                            "Ngay sinh", "SDT", "Gioi tinh");
                    System.out.println(dskh[index]);
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Nhap lai ngay sinh khach hang.");
                    System.out.print("Nhap ngay sinh: ");
                    int newDay = checkPattern.checkNgayThang(sc);
                    System.out.print("Nhap thang sinh: ");
                    int newMonth = checkPattern.checkNgayThang(sc);
                    System.out.print("Nhap nam sinh: ");
                    int newYear = checkPattern.checkNam(sc);
                    dskh[index].setBirthday(newYear, newMonth, newDay);
                    System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                            "Ngay sinh", "SDT", "Gioi tinh");
                    System.out.println(dskh[index]);
                    break;
                // case '4':
                // System.out.println();
                // System.out.print("Nhap lai dia chi khach hang: ");
                // String newAddress = sc.nextLine();
                // dskh[index].setAddress(newAddress);
                // System.out.printf("%-5s| %-15s| %-15s| %-10s| %-25s| %-11s| %-10s\n", "id",
                // "cccd", "Ten",
                // "Ngay sinh", "Dia chi", "SDT", "Gioi tinh");
                // System.out.println(dskh[index]);
                // break;
                case "4":
                    System.out.println();
                    System.out.print("Nhap lai sdt khach hang: ");
                    String newPhone = checkPattern.checkSdt(sc);
                    dskh[index].setPhonenumber(newPhone);
                    System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                            "Ngay sinh", "SDT", "Gioi tinh");
                    System.out.println(dskh[index]);
                    break;
                case "5":
                    System.out.println();
                    System.out.print("Nhap lai gioi tinh khach hang M/F: ");
                    char newGender = checkPattern.checkgt(sc);
                    dskh[index].setGender(newGender);
                    System.out.printf("%-5s| %-15s| %-15s| %-10s| %-11s| %-10s\n", "id", "cccd", "Ten",
                            "Ngay sinh", "SDT", "Gioi tinh");
                    System.out.println(dskh[index]);
                    break;
                default:
                    break;
            }
        } while (!option.equals("x"));
    }

    public void mainMenu(Scanner sc) {
        String option;
        do {
            System.out.println();
            System.out.println("========== Menu Khach Hang ==========");
            System.out.println("1. Hien danh sach khach hang.");
            System.out.println("2. Them khach hang moi.");
            System.out.println("3. Xoa khach hang.");
            System.out.println("4. Sua thong tin khach hang.");
            System.out.println("Nhap x de quay tro lai.");
            System.out.print("Chon thao tac ban muon lam: ");
            option = sc.nextLine();
            switch (option) {
                case "1":
                    XuatKH();
                    break;
                case "2":
                    themKHmoi(sc);
                    break;
                case "3":
                    xoaKH(sc);
                    break;
                case "4":
                    suaKH(sc);
                    break;
                default:
                    break;
            }
        } while (!option.equals("x"));
    }

    // public static void main(String[] args) {
    // dskhachhang ds = new dskhachhang();
    // Scanner sc = new Scanner(System.in);
    // ds.mainMenu(sc);
    // }
}
