package Aula06.program;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
//uniao
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
//interseccao
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
//diferenca
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
