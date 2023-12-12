import java.io.FileWriter;
import java.util.Arrays;

public class dsNhaCungCap {
    private nhacungcap[] dsncc;
    private int soluong;

    public dsNhaCungCap() {

    }

    public void addNCC(nhacungcap ncc) {
        dsncc = Arrays.copyOf(dsncc, soluong + 1);
        dsncc[soluong++] = ncc;
    }

    public boolean searchId(String id) {
        for (nhacungcap i : dsncc) {
            if (i.getId().equals(id))
                return true;
        }
        return false;
    }

    public void DeleteNCC(String id) {
        for (int i = 0; i < dsncc.length; i++) {
            if (dsncc[i].getId().equals(id)) {
                for (int j = i; j < dsncc.length - 1; j++)
                    dsncc[j] = dsncc[j + 1];
                break;
            }
        }
        dsncc = Arrays.copyOf(dsncc, soluong - 1);
    }

}
