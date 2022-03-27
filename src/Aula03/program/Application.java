package Aula03.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 4, 5, 7);
        List<String> listStr = Arrays.asList("Hello", "Hi", "Sr");

        printList(listInt);
        printList(listStr);

    }

    public static void printList(List<?> list) {
        //Nao e possivel adicionar objetos a lista quando utilizado o tipo curinga
        for (Object a : list) {
            System.out.println(a);
        }
    }
}
