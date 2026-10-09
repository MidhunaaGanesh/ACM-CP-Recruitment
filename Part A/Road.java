package ACM-CP-Recruitment.Part A;


import java.util.*;

public class Road {
    static class Edge {
        int a, b;
        long cost;

        Edge(int a, int b, long cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }
    }

    static class DSU {
        int[] parent, size;

        DSU(int n) {
            parent = new int[n + 1];
            size = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean unite(int a, int b) {
            a = find(a);
            b = find(b);

            if (a == b)
                return false;

            if (size[a] < size[b]) {
                int temp = a;
                a = b;
                b = temp;
            }

            parent[b] = a;
            size[a] += size[b];

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Edge[] roads = new Edge[m];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();

            roads[i] = new Edge(a, b, c);
        }

        Arrays.sort(roads,
            (a, b) -> Long.compare(a.cost, b.cost));

        DSU dsu = new DSU(n);

        long totalCost = 0;
        int used = 0;

        for (Edge e : roads) {
            if (dsu.unite(e.a, e.b)) {
                totalCost += e.cost;
                used++;
            }
        }

        if (used == n - 1) {
            System.out.println(totalCost);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
