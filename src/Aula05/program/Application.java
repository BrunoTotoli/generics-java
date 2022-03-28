package Aula05.program;

import Aula05.entities.Client;

public class Application {
    public static void main(String[] args) {
        Client c1 = new Client("Jao", "jao@gmail.com");
        Client c2 = new Client("Jao", "jao@gmail.com");
        Client c3 = new Client("Alex", "Alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1 == c2); //Vai dar false pois o == compara a referencia de memoria e nao o conteudo do objeto
        c2 = c1; // Aqui falo que o c2 vai referencia o mesmo objeto de c1 que vai dar true
        System.out.println(c1 == c2);
        String s = "Alex";
        String s1 = "Alex";
        System.out.println(s == s1); //O compilador ele trata a expressao literal de uma forma especial o que nao acontece quando da new String("Alex");

    }


}
