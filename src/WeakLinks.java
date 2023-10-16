import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class WeakLinks {

    static int time;
    static ArrayList<Integer[]> ans;
    static int [] pre;
    static int [] low;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt(), m = sc.nextInt();
            if(n == 0 && m == 0) break;
            ArrayList<Integer>[] TC = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                TC[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                if(TC[u].indexOf(v) == -1) TC[u].add(v);
                if(TC[v].indexOf(u) == -1) TC[v].add(u);
            }
            String ans = obtenerRespuesta(TC, n);
            System.out.println(ans);
        }
    }

    static String obtenerRespuesta(ArrayList<Integer>[] TC, int n){

        time =0;
        ans = new ArrayList<Integer[]>();
        pre = new int [n];
        low = new int [n];
        for (int i = 0; i < n; i++)
            pre[i] = low[i] = -1;
        for (int i = 0; i < n; i++)
            if(pre[i] == -1)
                dfs(i, -1, TC);
        Collections.sort(ans, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                return (a[0] - b[0] == 0) ? a[1] - b[1] : a[0] - b[0];
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(ans.size());
        for (Integer[] w : ans){
            String pt = String.format(" %d %d", w[0], w[1]);
            sb.append(pt);
        }
        return sb.toString();
    }
    static void dfs (int u, int parent, ArrayList<Integer>[] TC){
        pre[u] = low[u] = ++time;
        for (int v : TC[u]) {
            if(pre[v] == -1){
                dfs(v, u, TC);
                low[u] = Math.min(low[u], low[v]);
                if(low[v] == pre[v]){
                    int x = Math.min(u,v);
                    int y = Math.max(u,v);
                    ans.add(new Integer[] {x, y});
                }
            } else if (v != parent) {
                low[u] = Math.min(low[u], low[v]);
            }
        }
    }
}
