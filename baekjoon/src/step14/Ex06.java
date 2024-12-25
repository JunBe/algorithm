package step14;

import java.io.*;
import java.util.*;

//1764 듣보잡
public class Ex06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (map.get(name) != null && map.get(name) == 1) {
                count++;
                list.add(name);
            }
        }

        bw.write(count + "\n");
        Collections.sort(list);
        for (String val : list) {
            bw.write(val + "\n");
        }

        bw.flush();
        bw.close();
    }
}
