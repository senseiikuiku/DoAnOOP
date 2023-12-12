import java.io.FileWriter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class dsphieuxuat {
    private Phieuxuat[] lspx;
    private int soluong;

    public dsphieuxuat() {
        lspx = new Phieuxuat[0];
    }

    public void themPhieuXuat(Phieuxuat px) {
        lspx = Arrays.copyOf(lspx, soluong + 1);
        lspx[soluong++] = px;
    }

    public void xoaPhieuXuat(String id) {
        for (int i = 0; i < lspx.length; i++) {
            if (lspx[i].getId().equals(id)) {
                for (int j = i; j < lspx.length - 1; j++)
                    lspx[j] = lspx[j + 1];
                break;
            }
        }
        lspx = Arrays.copyOf(lspx, soluong - 1);
        soluong--;
    }

    public int searchId(String id) {
        for (int i = 0; i < lspx.length; i++) {
            if (lspx[i].getId().equals(id))
                return i;
        }
        return -1;
    }

    public void xuatPhieuXuat() {
        System.out.printf("%-15s| %-15s| %-15s| %-15s| %-15s\n", "id", "idkhachang", "idChiTietPx", "ngay ban",
                "idnguoiban");
        for (Phieuxuat i : lspx) {
            System.out.println(i);
        }
    }

    private int readSL() {
        int sl = 0;
        Pattern header = Pattern
                .compile("id\\s{13}\\| idkhachang\\s{5}\\| idChiTietPx\\s{4}\\| ngay ban\\s{7}\\| idnguoiban\\s{5}$");
        Pattern body = Pattern.compile("");

        return sl;
    }

    public void readFile() {
        soluong = readSL();
    }

    public void writeToFile() {
        try {
            FileWriter fs = new FileWriter("phieuxuat.txt");
            fs.write(String.format("%-15s| %-15s| %-15s| %-15s| %-15s\n", "id", "idkhachang", "idChiTietPx", "ngay ban",
                    "idnguoiban"));
            for (Phieuxuat i : lspx) {
                fs.write(i.toString() + "\n");
            }
            fs.close();
        } catch (Exception e) {
        }
    }

    // public static void main(String[] args) {
    // dsphieuxuat ls = new dsphieuxuat();
    // Phieuxuat a = new Phieuxuat("kh1", "ctpx1", 12, 5, 2023, "nv1");
    // Phieuxuat b = new Phieuxuat("kh1", "ctpx2", 10, 12, 2019, "nv1");
    // ls.themPhieuXuat(a);
    // ls.themPhieuXuat(b);
    // ls.xuatPhieuXuat();
    // ls.writeToFile();
    // }
}
