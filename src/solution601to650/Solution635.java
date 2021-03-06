package solution601to650;

import java.util.*;

public class Solution635 {
    ArrayList<long[]> list;
    public Solution635() {
        list = new ArrayList<long[]>();
    }

    public void put(int id, String timestamp) {
        int[] st = Arrays.stream(timestamp.split(":")).mapToInt(Integer::parseInt).toArray();
        list.add(new long[] {convert(st), id});
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        ArrayList < Integer > res = new ArrayList();
        long start = granularity(s, gra, false);
        long end = granularity(e, gra, true);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] >= start && list.get(i)[0] < end)
                res.add((int) list.get(i)[1]);
        }
        return res;
    }

    private long granularity(String s, String gra, boolean end) {
        HashMap< String, Integer > h = new HashMap();
        h.put("Year", 0);
        h.put("Month", 1);
        h.put("Day", 2);
        h.put("Hour", 3);
        h.put("Minute", 4);
        h.put("Second", 5);
        String[] res = new String[] {"1999", "00", "00", "00", "00", "00"};
        String[] st = s.split(":");
        for (int i = 0; i <= h.get(gra); i++) {
            res[i] = st[i];
        }
        int[] t = Arrays.stream(res).mapToInt(Integer::parseInt).toArray();
        if (end)
            t[h.get(gra)]++;
        return convert(t);
    }

    private long convert(int[] st) {
        st[1] = st[1] - (st[1] == 0 ? 0 : 1);
        st[2] = st[2] - (st[2] == 0 ? 0 : 1);
        return (st[0] - 1999L) * (31 * 12) * 24 * 60 * 60 + st[1] * 31 * 24 * 60 * 60 + st[2] * 24 * 60 * 60 + st[3] * 60 * 60 + st[4] * 60 + st[5];
    }

    public static void main(String[] args) {
        Solution635 s653 = new Solution635();
        s653.put(1, "2017:01:01:23:59:59");
        s653.put(2, "2017:01:01:22:59:59");
        s653.put(3, "2016:01:01:00:00:00");
        List res1 = s653.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Year");
        List res2 = s653.retrieve("2016:01:01:01:01:01","2017:01:01:23:00:00","Hour");
    }
}
