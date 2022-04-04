package Aula09.program;

import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("Email", "maria@gmail.com");
        cookies.put("phone", "99191919");

        cookies.remove("Email");
        cookies.put("phone", "8888000808");

        System.out.println("Contains 'phone' key: "+cookies.containsKey("phone"));
        System.out.println("Phone number: "+cookies.get("phone"));
        System.out.println("Email: "+cookies.get("Email"));
        System.out.println("Size: "+cookies.size());


        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }

}
