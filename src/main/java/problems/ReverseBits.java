package problems;

import java.util.Arrays;

public class ReverseBits {

    public int reverse(int n) {
        char[] bits = new char[32];
        Arrays.fill(bits, '0');
        StringBuffer sb = new StringBuffer();
        sb.append(bits);

        String s = Integer.toBinaryString(n);
        sb.insert(32 - s.length(), s);

        System.out.println(sb);

        long l = Long.parseLong(sb.reverse().toString(), 2);

        if (l > Integer.MAX_VALUE) {
            l = Integer.MAX_VALUE;
        }

        return (int) l;
    }
}
