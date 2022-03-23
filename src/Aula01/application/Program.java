package Aula01.application;

import Aula01.model.service.PrintService;

public class Program {

    public static void main(String[] args) {
        PrintService<Integer> ps = new PrintService<>();
        ps.addValue(1);
        ps.addValue(2);
        ps.addValue(3);
        System.out.println(ps.first());
        ps.print();
    }
}
