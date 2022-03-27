package Aula04.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class get_putTest {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObj = new ArrayList<>();

        copy(myInts, myObj);
        copy(myDoubles, myObj);

        printList(myObj);
    }

    private static void copy(List<? extends Number> copy, List<? super Number> paste) {
        for (Number n : copy) {
            paste.add(n);
        }
    }

    private static void printList(List<? extends Object> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

}
