package Algorithm.DataStructur.Group;

import java.util.LinkedList;
import java.util.List;

//import java.awt.List;

public class Vertex {

    String name;
    List<Edge> edges;

    boolean visited; //是否被访问过

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
//        Vertex d = new Vertex("D");
//        a.edges = List.of(new Edge(b),new Edge(c));
//        b.edges = List.of(new Edge(d));
//        c.edges = List.of(new Edge(d));
//        d.edges = List.of();

//        System.out.println();
        dfs2(a);
    }

    private static void dfs2(Vertex v) {
        LinkedList<Vertex> stack = new LinkedList<>();
        stack.push(v);
        while (!stack.isEmpty()) {
            Vertex pop = stack.pop();
            pop.visited = true;
            System.out.println(pop.name);
            for (Edge edge : pop.edges) {
                if (!edge.linked.visited) {
                    stack.push(edge.linked);
                }
            }
        }
    }
    private static void dfs(Vertex v) {
        v.visited = true;
        System.out.println(v.name);
        for (Edge edge : v.edges) {
            if (!edge.linked.visited) {
                dfs(edge.linked);
            }
        }
    }


}
