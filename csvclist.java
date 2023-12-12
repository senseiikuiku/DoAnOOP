import java.util.Arrays;

public class csvclist {
    private csvc[] list;
    private int n; // so luong csvc

    public csvclist() {
    }

    public void addCSVC(csvc CSVC) {
        list = Arrays.copyOf(list, n + 1);
        list[n++] = CSVC;
    }

    public void deleteCSVC(String id) {
        for (int i = 0; i <= n - 1; i++) {
            if (list[i].getId() == id) {
                for (int j = (i + 1); j < n; j++)
                    list[i] = list[j];
                break;
            }
        }
        list = Arrays.copyOf(list, n - 1);
        n--;
    }

}
