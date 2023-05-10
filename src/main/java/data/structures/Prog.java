package data.structures;

import java.util.ArrayList;
import java.util.List;

public class Prog {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("Louis CK");
        people.add("Sam Kinison");
        people.add("Bill Burr");

        System.out.println(people);
        people.add(0,"Stavros Halkias");
        System.out.println(people);
        people.remove("Sam Kinison");
        System.out.println(people);
        people.remove(1);
        System.out.println(people);
    }
}
