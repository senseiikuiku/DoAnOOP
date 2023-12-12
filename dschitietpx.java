import java.util.Arrays;

public class dschitietpx {
    private Chitietpx[] lsctpx;
    private int soluong;

    public dschitietpx() {
        lsctpx = new Chitietpx[0];
    }

    public void themCtPx(Chitietpx ctpx) {
        lsctpx = Arrays.copyOf(lsctpx, soluong + 1);
        lsctpx[soluong++] = ctpx;
    }

    public void xoaCtPx(String id) {
        for (int i = 0; i < lsctpx.length; i++) {
            if (lsctpx[i].getId().equals(id)) {
                for (int j = i; j < lsctpx.length - 1; j++)
                    lsctpx[j] = lsctpx[j + 1];
                break;
            }
        }
        lsctpx = Arrays.copyOf(lsctpx, soluong - 1);
        soluong--;
    }

}
