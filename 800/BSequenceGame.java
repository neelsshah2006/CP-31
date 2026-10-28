import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class BSequenceGame {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int len = 0, ptr = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        int n, idx;
        StringBuilder ans = new StringBuilder();
        while (t-- > 0) {
            n = fs.nextInt();
            idx = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(fs.nextInt());
                if (i > 0 && arr.get(i) < arr.get(i - 1))
                    idx++;
                idx++;
            }

            ans.append(idx + "\n");
            for (int i = 0; i < n; i++) {
                ans.append(arr.get(i) + " ");
                if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                    ans.append(arr.get(i) + " ");
                }
            }
            ans.append("\n");
        }
        System.out.println(ans);
    }
}