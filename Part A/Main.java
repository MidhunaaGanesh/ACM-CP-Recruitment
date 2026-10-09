package ACM-CP-Recruitment.Part A;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long t = sc.nextLong();

        long[] k = new long[n];
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            k[i] = sc.nextLong();
            min = Math.min(min, k[i]);
        }

        long low = 1;
        long high = min * t;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long products = 0;

            for (int i = 0; i < n; i++) {
                products += mid / k[i];

                if (products >= t)
                    break;
            }

            if (products >= t) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}