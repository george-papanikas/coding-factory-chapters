package gr.aueb.cf.ch19.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BagOfCoins {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        //Set<String> bag = new HashSet<>(List.of("Athens", "London", "Paris", "Paris"));
        // list is converted to HashSet and add methods are not used as population is already done

        bag.add("Athens");
        bag.add("Athens"); // Athens can be included only one time, as Set does not allow duplicates
        bag.add("Paris");
        bag.add("London");

        bag.remove("London");

        bag.forEach(System.out::println);


    }
}

//
