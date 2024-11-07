package gr.aueb.cf.ch19.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List<String> cities = List.of("Athens", "Paris", "London"); //unmodifiable list
        List<String> cities = new ArrayList<>(List.of("Athens", "Paris", "London")); //modifiable list
        Iterator<String> it = cities.iterator();

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        //enhanced for is backed up by iterator
        for (String s : cities) {
            System.out.println(s);
        }

        while (it.hasNext()) { //iterator is initialized by showing before first element
            String s = it.next();
            System.out.println(s);
            //System.out.println(it.next());
        }

        //forEach is backed up by iterator
        cities.forEach(System.out::println);

        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("London")) {
                it.remove();
                //cities.remove(s); not right solution inside while as it loses reference
            }
        }
        cities.removeIf(s -> s.equals("Paris")); //removeIf operates with predicates/boolean functions
    }
}
