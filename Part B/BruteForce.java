package ACM-CP-Recruitment.Part B;

   

import java.util.*;

public class BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = i; j < n; j++) {
                sum += a[j];

                if (sum == x) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
