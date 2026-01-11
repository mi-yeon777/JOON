package day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 도화지 (100 x 100)
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 색종이 10 x 10 덮기
            for (int dx = x; dx < x + 10; dx++) {
                for (int dy = y; dy < y + 10; dy++) {
                    paper[dx][dy] = true;
                }
            }
        }

        // 넓이 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) area++;
            }
        }

        System.out.println(area);
    }
}
