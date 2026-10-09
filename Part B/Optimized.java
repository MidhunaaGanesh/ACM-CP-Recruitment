package ACM-CP-Recruitment.Part B;


import java.util.*;

public class Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        HashMap<Long, Long> freq = new HashMap<>();
        freq.put(0L, 1L);

        long sum = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();

            ans += freq.getOrDefault(sum - x, 0L);

            freq.put(sum, freq.getOrDefault(sum, 0L) + 1);
        }

        System.out.println(ans);
    }
}

// Optimized (Prefix Sum + HashMap):
// Time Complexity: O(n) - processes each element once.
// Space Complexity: O(n) - stores prefix sums in a HashMap.
//The total number of loop iterations decrease.